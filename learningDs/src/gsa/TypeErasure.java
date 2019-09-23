package gsa;

import java.util.HashMap;
import java.util.Map;

public class TypeErasure {
    public static void main(String args[]) {

        Map genericsMap = new HashMap();
        Map<String, String> noGenericsMap = new HashMap();


        genericsMap.put("1954", "FORTRAN String key");
        Object language = genericsMap.get("1954");
        System.out.println("Language: "+language);

        genericsMap.put(1954, "FORTRAN Integer key");
//        var language1 = genericsMap.get(1954);
        Object language1 = genericsMap.get(1954);
        System.out.println("Language: "+language1);


//        noGenericsMap.put("T", "A");

    }
}