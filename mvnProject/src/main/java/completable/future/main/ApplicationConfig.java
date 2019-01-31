package completable.future.main;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import jdk.nashorn.internal.ir.ObjectNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;


@SpringBootApplication
//@EnableAsync
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


    private static final String jsonString = "{\"simianarmy\":{\"chaos\":{\"enabled\":\"true\",\"leashed\":\"false\",\"ASG\":{\"enabled\":\"false\",\"probability\":\"6.0\",\"maxTerminationsPerDay\":\"10.0\",\"IS\":{\"enabled\":\"true\",\"probability\":\"6\",\"maxTerminationsPerDay\":\"100.0\"}}}}}";

    private static final T[] objects = {new T("A"), new T("B")};
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final TypeReference<List<T>> listReference = new TypeReference<List<T>>() {
    };

    public static void main(String[] args) throws Exception {
//        String string = mapper.writeValueAsString(objects);
//        List<?> list = mapper.readValue(string, List.class);
//        mapper.readValue(string, listReference);
//        mapper.readValue(mapper.writeValueAsString(list), listReference);
//        System.out.println(list);
//        System.out.println(string);
        jsonToString(jsonString);
        // Can i read the value directly from list without converting it to string?
    }


    public static void jsonToString(String jsonContent) {
//        Gson gson = new GsonAutoConfiguration()

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            ObjectNode simianarmy = objectMapper.readValue(jsonContent, ObjectNode.class);
            System.out.println(simianarmy);
//            System.out.println(simianarmy.getClass());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public class Simianarmy {

        private Chaos chaos;

        public Chaos getChaos() {
            return chaos;
        }

        public void setChaos(Chaos chaos) {
            this.chaos = chaos;
        }

        @Override
        public String toString() {
            return "Simianarmy{" +
                "chaos=" + chaos +
                '}';
        }
    }

    public class Chaos {

        private Boolean enabled;
        private Boolean leashed;
        private ASG asg;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Boolean getLeashed() {
            return leashed;
        }

        public void setLeashed(Boolean leashed) {
            this.leashed = leashed;
        }

        public ASG getAsg() {
            return asg;
        }

        public void setAsg(ASG asg) {
            this.asg = asg;
        }

        @Override
        public String toString() {
            return "Chaos{" +
                "enabled=" + enabled +
                ", leashed=" + leashed +
                ", asg=" + asg +
                '}';
        }
    }

    public class ASG {

        private Boolean enabled;
        private Double probability;
        private Double maxTerminationsPerDay;
        private IS is;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Double getProbability() {
            return probability;
        }

        public void setProbability(Double probability) {
            this.probability = probability;
        }

        public Double getMaxTerminationsPerDay() {
            return maxTerminationsPerDay;
        }

        public void setMaxTerminationsPerDay(Double maxTerminationsPerDay) {
            this.maxTerminationsPerDay = maxTerminationsPerDay;
        }

        public IS getIs() {
            return is;
        }

        public void setIs(IS is) {
            this.is = is;
        }
    }


    public class IS {

        private Boolean enabled;
        private Double probability;
        private Double maxTerminationsPerDay;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Double getProbability() {
            return probability;
        }

        public void setProbability(Double probability) {
            this.probability = probability;
        }

        public Double getMaxTerminationsPerDay() {
            return maxTerminationsPerDay;
        }

        public void setMaxTerminationsPerDay(Double maxTerminationsPerDay) {
            this.maxTerminationsPerDay = maxTerminationsPerDay;
        }
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

    public class Foo {

        private Integer value;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    public class TestVoidMethodCall {

        public void voidMethod() {
            Foo f = new Foo();
            f.setValue(100);
            System.out.println(integerReturnMethod(f));
        }

        private Integer integerReturnMethod(Foo f) {
            return f.getValue();
        }
    }


    class test {

        int x(test ob) {
            return 10;
        }
    }
}