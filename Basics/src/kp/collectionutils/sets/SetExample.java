package kp.collectionutils.sets;

import java.util.*;

public class SetExample {
    public static void main (String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("ab");
        set.add("abc1");
        set.add("abc2");
        set.add("abc3");
        set.add("aaaa");
        Iterator e = set.iterator();
        System.out.println("HashSet:");
        while (e.hasNext()) {
            System.out.println(e.next());
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("ab");
        linkedHashSet.add("abc1");
        linkedHashSet.add("abc2");
        linkedHashSet.add("abc3");
        linkedHashSet.add("aaaa");
        Iterator ls  = linkedHashSet.iterator();
        System.out.println("LinkedHashSet:Maintained the insertion order");
        while (ls.hasNext()) {
            System.out.println(ls.next());
        }

        TreeSet<String> ts = new TreeSet<>(set);
        Iterator t = ts.iterator();
        System.out.println("TreeSet:sort in ascending the insertion order");
        while (t.hasNext()) {
            System.out.println(t.next());
        }

        SortedSet<String> sts = new TreeSet<>(set);
        Iterator st = sts.iterator();
        System.out.println("SortedSet:sort in ascending the insertion order");
        while (st.hasNext()) {
            System.out.println(st.next());
        }

    }

}
