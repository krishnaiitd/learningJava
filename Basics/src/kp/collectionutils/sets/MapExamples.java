package kp.collectionutils.sets;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>(10);

        map.put("a", "krishna");
        map.put("2", "prasad");
        map.put("1", "prasad");
        map.put("3", "prasad");

        System.out.println("HashMap");
        for(Map.Entry<String, String> m: map.entrySet()) {
            System.out.println(m);
//            System.out.println(m.getKey());
//            System.out.println(m.getValue());
        }

        TreeMap<String, String> tmap = new TreeMap<>();
        tmap.put("a", "krishna");
        tmap.put("2", "prasad");
        tmap.put("1", "prasad");
        tmap.put("3", "prasad");

        System.out.println("TreeMap");
        for (Map.Entry<String, String> tm : tmap.entrySet()) {
            System.out.println(tm);
//            System.out.println(tm.getKey());
//            System.out.println(tm.getValue());
        }


    }

}
