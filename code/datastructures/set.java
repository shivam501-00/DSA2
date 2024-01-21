
package code.datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class set {
    public static void main(String[] args) {
        /*
         * Set is datastructure, which doesn't accept duplicate values, for methodes
         * related to sets visit "https://www.javatpoint.com/set-in-java"
         */
        // Declaration of set
        // Set <Datatype> set_name = new HashSet<>();

        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(5);
        System.out.println(s);
        System.out.println(s.size());

        Integer[] a = { 1, 1, 1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 7, 7, 8 };
        /*
         * Here while defining array we need to define it
         * datatype as "Integer" rather defining it as
         * "int". So that the set "set1" in which we are adding
         * all element should understand its data type and
         * arrays datatype is same
         */

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(a));
        System.out.println(set1);

        // creating array from given set
        int n = set1.size();
        int[] a1 = new int[n];
        int i = 0;
        for (Integer e : set1) {
            a1[i++] = e;
        }
        System.out.println(Arrays.toString(a1));
    }
}