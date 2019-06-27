/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.data.mongo.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;
import sample.data.mongo.models.Customer;
import sample.data.mongo.repository.CustomerRepository;

@SpringBootApplication(scanBasePackages = "sample.data.mongo")
@EnableConfigurationProperties
@EnableMongoRepositories(basePackages = "sample.data.mongo.repository")
public class Application {

    @Autowired
    private MongoOperations mongoOperation;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
        MongoMappingContext context) {

        MappingMongoConverter converter =
            new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);

        return mongoTemplate;
    }


    @Bean
    CommandLineRunner init(final CustomerRepository customerRepository) {

        System.out.println(customerRepository.findByFirstName("Alice"));
        return new CommandLineRunner() {
            public void run(String... args) throws Exception {

                // Insert and return
                Customer newCustomer = new Customer("First Name", "Last Name", "ABC address");
                customerRepository.insert(newCustomer);
                System.out.println("newCustomer object updated, you can return from here ");
                System.out.println(newCustomer);
                // return newCustomer;

                // find and update and then return
                Query query = new Query();
                query.addCriteria(Criteria.where("firstName").is("First Name"));

                Update update = new Update();
                update.set("lastName", "modified last name");

                FindAndModifyOptions options = new FindAndModifyOptions();
                options.upsert(true);
                options.returnNew(true);

                try {
                    Customer modifiedCustomer = mongoOperation
                        .findAndModify(query, update, options, Customer.class);
                    // Modified data
                    System.out.println("Modified Custom data\n");
                    System.out.println(modifiedCustomer);
                    // Return from here;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    throw e;
                }


            }
        };

    }


}
