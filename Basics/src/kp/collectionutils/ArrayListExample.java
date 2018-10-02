package kp.collectionutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("Krishna");
//        arrayList.add("Prasad");
//
////        System.out.println(arrayList.toArray().toString());
//        Iterator it = arrayList.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }


        List<String> a = Arrays.asList((new String[]{"a", "b", "c"}));
        System.out.println(a);

        List<String> aa = Arrays.asList((new String[]{"a", "c"}));

        // Find the difference of a and aa i.e here only will be the ans b
        List<String> ans = a.stream()
                .filter(elm -> {
                    return !aa.contains(elm);
                })
                .collect(Collectors.toList());
        System.out.println(ans);

        // Below removeAll not work
//        a.removeAll(aa);

        System.out.println(a);
        System.out.println(aa);

        //If we only want find missing values in a, you can do:
        List toReturn = new ArrayList(a);
        toReturn.removeAll(aa);

        System.out.println(toReturn);



//        System.out.println(aa);
//
//
//        String aaa[] = new String[]{"abc", "axys"};
//
//        System.out.println(Arrays.stream(aaa).findAny().get());


    }
}
