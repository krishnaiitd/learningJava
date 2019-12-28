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

import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;
import sample.data.mongo.models.ChangeEvent;
import sample.data.mongo.models.Stores;
import sample.data.mongo.repository.SpringDataRepository;
import sample.data.mongo.services.LookupAggregation;

@SpringBootApplication(scanBasePackages = "sample.data.mongo")
@EnableConfigurationProperties
@EnableMongoRepositories(basePackages = "sample.data.mongo.repository")
public class Application {

  @Autowired
  private MongoOperations mongoOperation;

  @Autowired
  private MongoTemplate mongoTemplate;

  @Autowired
  private LookupAggregation lookupAggregation;

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  private static final Logger logger = LoggerFactory.getLogger(Application.class);


  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  CommandLineRunner init(final SpringDataRepository springDataRepository) {

    return new CommandLineRunner() {
      public void run(String... args) throws Exception {

//        System.out.println("====================");
//        System.out.println("Get the value by findFieldDataByRegexMatch");
//        System.out.println(springDataRepository.findFieldDataByRegexMatch("Org1", "key2", "iso"));
//
//        System.out.println(springDataRepository.getDataByQueryAnnotation("Org1", "key2", "iso.*" ));
//        System.out.println("====================");
//
//        System.out.println("=================Simple Example=============");
////        System.out.println(springDataRepository.getDataByQueryRegex());
//        System.out.println("=================Simple Example=============");
////
//
//        System.out.println("Heelo");
//
//        List<Criteria> criteriaListAnd = new ArrayList<>();
//        Criteria criteria = new Criteria();
//        String pattern = "/iso/i";
//        String key = "key2";
//
//        criteriaListAnd.add(Criteria.where("organization").is("Org1"));
//        criteriaListAnd.add(Criteria.where("active").is(true));
//        criteriaListAnd.add(Criteria.where("fields").elemMatch(Criteria.where("key").is(key).and("value").regex(pattern)));
//        criteria.andOperator(criteriaListAnd.toArray(new Criteria[criteriaListAnd.size()]));
//
//        Query query = new Query();
//        query.addCriteria(criteria);

//        List<Springdata> objects = mongoTemplate().find(query, Springdata.class);

        // Function for Questions: https://stackoverflow.com/questions/59034265/mongotemplate-pull-query
//        stackoverflowQ59034265();

//        https://stackoverflow.com/questions/59167359/why-does-spring-data-fail-on-date-queries
//        stackoverflow59167359();

//        // Insert and return
//        Customer newCustomer = new Customer("First Name", "Last Name", "ABC address");
//        customerRepository.insert(newCustomer);
//        System.out.println("newCustomer object updated, you can return from here ");
//        System.out.println(newCustomer);
//        // return newCustomer;
//
//        // find and update and then return
//        Query query = new Query();
//        query.addCriteria(Criteria.where("firstName").is("First Name"));
//
//        Update update = new Update();
//        update.set("lastName", "modified last name");
//
//        FindAndModifyOptions options = new FindAndModifyOptions();
//        options.upsert(true);
//        options.returnNew(true);
//
//        try {
//          Customer modifiedCustomer = mongoOperation
//              .findAndModify(query, update, options, Customer.class);
//          // Modified data
//          System.out.println("Modified Custom data\n");
//          System.out.println(modifiedCustomer);
//          // Return from here;
//        } catch (Exception e) {
//          System.out.println(e.getMessage());
//          throw e;
//        }

        //https://stackoverflow.com/questions/59495531/about-springdata-mongodb-aggregation
        lookupAggregation.LookupAggregationExample();

      }

      public void stackoverflowQ59034265() {
        System.out.println(mongoTemplate.getDb().getName());
        for (String name : mongoTemplate.getDb().listCollectionNames()) {
          System.out.println(name);
        }
        List<Stores> storesList = mongoTemplate.find(new Query(), Stores.class);
        for(Stores stores : storesList) {
          System.out.println(stores.toString());
        }
        mongoTemplate.updateMulti(new Query(), new Update().pull("vegetables", "squash"), "stores");
        List<Stores> afterModificationStoresList = mongoTemplate.find(new Query(), Stores.class);
        for(Stores stores : afterModificationStoresList) {
          System.out.println(stores.toString());
        }

      }
    };

  }

//  https://stackoverflow.com/questions/59167359/why-does-spring-data-fail-on-date-queries
  public void stackoverflow59167359() {

    //Find change list query: Query: { "bappid" : "BAPP0131337", "changedOn" : { "$gte" : { "$date" : 1575418473670 } } }, Fields: { }, Sort: { }
    fetchChangeList("BAPP0131337", new Date(1543889916), null);

  }

  public List<ChangeEvent> fetchChangeList(String bappid, Date from, Date to) {
    Criteria criteria = null;
    criteria = Criteria.where("bappid").is(bappid);
    Query query = Query.query(criteria);
    if (from != null && to == null) {
      criteria = Criteria.where("changedOn").gte(from);
      query.addCriteria(criteria);
    } else if (to != null && from == null) {
      criteria = Criteria.where("changedOn").lte(to);
      query.addCriteria(criteria);
    } else if (from != null && to != null) {
      criteria = Criteria.where("changedOn").gte(from).lte(to);
      query.addCriteria(criteria);
    }
    logger.info("Find change list query: {}", query.toString());

    List<ChangeEvent> result = mongoTemplate.find(query, ChangeEvent.class, "changeEvents");
    logger.info("Result set is " +  result.toString());
//    return result;

    System.out.println(mongoTemplate.getDb().getName());

    Query query1 = new Query(Criteria.where("bappid").is(bappid));
    // Below commented query will not work
//    List<ChangeEvent> result1 = mongoTemplate.find(query, ChangeEvent.class);
    // Below query works fine:
    List<ChangeEvent> result1 = mongoTemplate.find(query1, ChangeEvent.class, "changeEvents");
    logger.info("Result set is " +  result1.toString());

//    mongoTemplate.find



    return result1;

  }





//  @Bean
//  CommandLineRunner init(final CustomerRepository customerRepository) {
//
//
//
//
////    System.out.println(customerRepository.findByFirstName("Alice"));
//    System.out.println(customerRepository.findByFirstName("Alice"));
//
//
//    return new CommandLineRunner() {
//      public void run(String... args) throws Exception {
//
//        // Insert and return
//        Customer newCustomer = new Customer("First Name", "Last Name", "ABC address");
//        customerRepository.insert(newCustomer);
//        System.out.println("newCustomer object updated, you can return from here ");
//        System.out.println(newCustomer);
//        // return newCustomer;
//
//        // find and update and then return
//        Query query = new Query();
//        query.addCriteria(Criteria.where("firstName").is("First Name"));
//
//        Update update = new Update();
//        update.set("lastName", "modified last name");
//
//        FindAndModifyOptions options = new FindAndModifyOptions();
//        options.upsert(true);
//        options.returnNew(true);
//
//        try {
//          Customer modifiedCustomer = mongoOperation
//              .findAndModify(query, update, options, Customer.class);
//          // Modified data
//          System.out.println("Modified Custom data\n");
//          System.out.println(modifiedCustomer);
//          // Return from here;
//        } catch (Exception e) {
//          System.out.println(e.getMessage());
//          throw e;
//        }
//
//
//      }
//    };
//
//  }


}
