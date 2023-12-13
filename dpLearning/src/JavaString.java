import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaString {
    public static void main(String[] args) {
        List<String> slist = new ArrayList<>();

        slist.add("Krishna");
        slist.add("Prasad");
        System.out.println(String.join(" ", slist));
        String result = slist.stream().map(Objects::toString).collect(Collectors.joining("\t"));
        System.out.println(result);


        // Use case of flatMap
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Array to a stream
        Stream<String[]> stream1 = Arrays.stream(array);

        // same result
        Stream<String[]> stream2 = Stream.of(array);

        // Filter all string except "a"
        List<String[]> result1 = stream1
                .filter(s -> !s.equals("a")) // s is a String[], not String!
                .collect(Collectors.toList());
        System.out.println(result1.size());
        result1.forEach(System.out::println);

        // In the filter it required to iterate again
        // x is a String[]
        List<String[]> result3 = Stream.of(array)
                .filter(x -> {
                    for(String s : x){      // really?
                        if(!s.equals("a")){
                            return true;
                        }
                    }
                    return false;
                }).collect(Collectors.toList());

        // print array
        System.out.println(result3.size());
        result3.forEach(x -> System.out.println(Arrays.toString(x)));


        // Here we can use the flatMap
        List<String> result4 = Stream.of(array)
                .flatMap(Stream::of)
                        .filter(s -> !s.equals("a"))
                                .collect(Collectors.toList());
        System.out.println(result4);


    }
}
