package kp.collectionutils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Krishna");
        arrayList.add("Prasad");

//        System.out.println(arrayList.toArray().toString());
        Iterator it = arrayList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        List a = Arrays.asList((new String[]{"a", "b"}));
        System.out.println(a);

        List aa = Arrays.asList("a", "c");

        System.out.println(aa);


        String aaa[] = new String[]{"abc", "axys"};

        System.out.println(Arrays.stream(aaa).findAny().get());


    }
}
