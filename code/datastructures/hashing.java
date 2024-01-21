package code.datastructures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import code.datastructures.*;
import code.sort.array_sort;

import javafx.collections.MapChangeListener;

public class hashing {
    public static void main(String[] args) {
        // Creating scanner obj
        Scanner sc = new Scanner(System.in);

        // enter size of array
        System.out.println("enter size of array:");
        int n = sc.nextInt();

        // Initialize array with size that we take input as "n"
        int[] a = new int[n];

        System.out.println("enter element of arrays: ");

        // Enter array element in array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        // test if array is saved or not
        System.out.println("This is array a :" + Arrays.toString(a));

        // precomputing
        // calling large_num() method from Pt class of patterns to find large num of
        // array as we need hash array to be size of large_num(a)+1

        int h = Pt.large_num(a) + 1;

        // Initializing hash array with size h
        int[] hash = new int[h];

        // test to see if array is created or not
        System.out.println("This is initial Hash  : " + Arrays.toString(hash));

        // loop to store count of values from a array in hash array at
        // hash[a(values)]
        for (int k = 0; k < a.length; k++) {
            hash[a[k]] += 1;
        }
        System.out.println("This is Hash of a : " + Arrays.toString(hash));

        // Test cases
        System.out.println("enter number of test");
        int q = sc.nextInt();
        if (q >= h) {
            throw new IllegalArgumentException(" please enter numbers that you entered in array");
        }
        System.out.println("Number of " + q + " present in array a are " + hash[q]);

        ////// hashmap for character string
        System.out.println("enter lower case string: ");
        String s = sc.nextLine();
        System.out.println(s);
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));

        int[] shash = new int[256];

        for (int i = 0; i < s.length(); i++) {
            // shash[c[i] - 'a'] += 1;// for lower case
            // shash[c[i] - 'A'] += 1;// for upper case
            shash[c[i]] += 1; // for 256 ascii char -remember to increase array size to
            // 256

        }

        System.out.println(Arrays.toString(shash));

        // test
        System.out.println("enter char: ");
        char ch = 'A';

        System.out.println("count of character " + ch + " is " + shash[ch]);
    }

    // HASH MAP code
    /*
     * System.out.println("enter size of array:");
     * int n = sc.nextInt();
     * 
     * // Initialize array with size that we take input as "n"
     * int[] a = new int[n];
     * 
     * System.out.println("enter element of arrays: ");
     * 
     * // Enter array element in array
     * for (int i = 0; i < n; i++) {
     * a[i] = sc.nextInt();
     * 
     * }
     * // test if array is saved or not
     * System.out.println("This is array a :" + Arrays.toString(a));
     * 
     * Map<Integer, Integer> hashM = new HashMap<>();
     * 
     * for (int j = 0; j < n; j++) {
     * hashM.put(a[j], hashM.getOrDefault(a[j], 0) + 1);
     * }
     * System.out.println("This is the HashMap hashM: " + hashM);
     * 
     * }
     * 
     */}