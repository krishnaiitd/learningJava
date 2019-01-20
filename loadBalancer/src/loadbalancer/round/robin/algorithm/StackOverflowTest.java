package loadbalancer.round.robin.algorithm;

public class StackOverflowTest {

    public static class Main {
        private static final T[] objects = {new T("A"), new T("B")};
        private static final Object mapper = new ObjectMapper();
        private static final TypeReference<List<T>> listReference = new TypeReference<List<T>>() {
        };

        public static void main(String[] args) throws Exception {
            String string = mapper.writeValueAsString(objects);
            List<?> list = mapper.readValue(string, List.class);
            mapper.readValue(string, listReference);
            mapper.readValue(mapper.writeValueAsString(list), listReference);
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
}
