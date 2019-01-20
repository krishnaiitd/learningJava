package completable.future.main;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ApplicationConfig {

//    public static void main(String[] args) {
//        // close the application context to shut down the custom ExecutorService
//        SpringApplication.run(ApplicationConfig.class, args).close();
//    }

//    @Bean
//    public Executor asyncExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(2);
//        executor.setMaxPoolSize(2);
//        executor.setQueueCapacity(500);
//        executor.setThreadNamePrefix("GithubLookup-");
//        executor.initialize();
//        return executor;
//    }


    private static final T[] objects = {new T("A"), new T("B")};
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final TypeReference<List<T>> listReference = new TypeReference<List<T>>() {
    };

    public static void main(String[] args) throws Exception {
        String string = mapper.writeValueAsString(objects);
        List<?> list = mapper.readValue(string, List.class);
        mapper.readValue(string, listReference);
        mapper.readValue(mapper.writeValueAsString(list), listReference);
        System.out.println(list);
        System.out.println(string);
        // Can i read the value directly from list without converting it to string?
    }

    @JsonAutoDetect(fieldVisibility = Visibility.ANY)
    public static class T {

        private String name;

        public T() {
        }

        public T(String name) {
            this.name = name;
        }
    }

}
