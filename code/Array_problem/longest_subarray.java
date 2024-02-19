package code.Array_problem;

import java.util.*;
// import code.datastructures.hashmap;

//longest subarray with sum K with array of positive numbers 

public class longest_subarray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 3, 1, 1, 1, 1, 3 };
        int n = a.length;
        // System.out.println("Longest subarray with sum 3 " + brute_l_sub(a, 4, n));
        // System.out.println("Longest subarray with sum 3 " + better_l_sub(a, 4, n));
        System.out.println("Longest subarray with sum 3 " + optimal_l_sub(a, 4, n));

    }
    // brute approach

    static int brute_l_sub(int[] a, int k, int n) {
        // [1,2,1,3,1,1,1,3]
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                /*
                 * in if we are checking that if sum from i to j is k. then we compare len with
                 * new lenght whichever is max
                 */
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    static int better_l_sub(int[] a, long k, int n) {
        long sum = 0;
        int maxlen = 0;

        Map<Long, Integer> preSum = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            /* First we calculate sum till i */
            sum += a[i];
            /*
             * check if sum till i is equal to sum we want i.e. k, if yes then update maxlen
             * by checking whoever have bigger length
             */
            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }

            /* find remider */
            long rem = sum - k;

            /*
             * check if map contains rem at any point and then get len by subtracting its
             * value which is stored as index in ma p from current index i. and then check
             * which have bigger length
             */
            if (preSum.containsKey(rem)) {
                int len = i - preSum.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            /* add sum and i as key value in map */
            if (!preSum.containsKey(sum)) {
                preSum.put(sum, i);
            }

        }
        return maxlen;
    }

    /* Only for Positive integer */
    static int optimal_l_sub(int[] a, long k, int n) {
        long sum = a[0];
        int maxlen = 0;
        /* lets use pointer right and left at index 0 of array */
        int right = 0;
        int left = 0;

        while (right < n) {
            /*
             * Second step: do first step after checking if sum is greater than k,while both
             * true
             */
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            /* Update maxlen */
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            /*
             * First step : to shift right by one place and update sum till right is less
             * than length of array
             */
            right++;
            if (right < n) {
                sum += a[right];
            }
        }
        return maxlen;

    }
}
