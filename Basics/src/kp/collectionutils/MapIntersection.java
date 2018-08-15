package kp.collectionutils;

import java.util.*;

public class MapIntersection {
    public static void main(String args[]) {

        Map<String, String> options = new HashMap<>();
        for(int i =0; i< 5; i++) {
            options.put("a"+ i, "value of a with number " + i);
        }

        // loop on entry set
        for(Map.Entry<String, String> option :options.entrySet()) {
            System.out.println(option);
            System.out.println(option.getKey());
            System.out.println(option.getValue());
        }

        for(String key: options.keySet()) {
            System.out.println(options.get(key));
            System.out.println(key);
        }

//
//        // Find all the values of a1, a3 or whatever the list given, without loop
//
//        System.out.println(options.toString());
//        System.out.println("entry set:" + options.entrySet());
//        System.out.println("key set:" + options.keySet());
//
//        List<String> keys = Arrays.asList("a1", "a3");
//        System.out.println(keys);
//
//        List selectedOptions = options.entrySet()
//                .stream().filter(el -> el.getKey().equals("a2")).collect(Collectors.toList());
//
//        System.out.println(selectedOptions);
//
//




    }
}
