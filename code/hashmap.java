package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> countryInfo = new HashMap<>();

        countryInfo.put("India", 130);
        countryInfo.put("China", 180);
        countryInfo.put("China", 183);// Update value for key if it is already prsent
        countryInfo.put("USA", 80);
        countryInfo.put("France", 50);
        countryInfo.put("Russia", 90);
        System.out.println(countryInfo);

        // Coping all info from "countryInfo" to newly Created "country" map

        HashMap<String, Integer> country = new HashMap<>();
        country.putAll(countryInfo);// putAll copies everything from some other map and put it in new map
        System.out.println("New hashmaap : " + country);

        // for searching some key we use ".containsKey"
        if (countryInfo.containsKey("India")) {
            System.out.println("Map contains key India in it");
        } else {
            System.out.println("sorry, it doesn't contain given key");
        }

        // to check value for some key we use ".get"
        System.out.println(countryInfo.get("India"));// value= 130
        System.out.println(countryInfo.get("Sri Lanka"));// null is default value if map doesn't contains key.
        System.out.println(countryInfo.getOrDefault("Spain", 0));// we can set default value by using ".getorDefault()"
        // function

        /*
         * For itreation we use different type of for which is specifically used for
         * collection
         * for(int val : collection)
         * collection can only be arrays for this kind of loops.
         */
        /*
         * int[] a = { 5, 1, 7, 3, 9, 7, 10 };
         * for (int e : a) {
         * System.out.println(Arrays.toString(a));
         * }
         */

        /* To create set from map of key value pairs we use below code */

        Map.Entry<String, Integer> e; // this will basically creates set by taking Pair of map as element e
        countryInfo.entrySet();// This will define from which map object we want to create entrySet()
        System.out.println(countryInfo.entrySet());

        for (Map.Entry<String, Integer> ele : countryInfo.entrySet()) {
            System.out.println(ele);
            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }

        Set<String> keys = countryInfo.keySet();
        for (String el : keys) {
            System.out.println(el);
            System.out.println(countryInfo.getOrDefault(el, 0));

        }

    }
}
