package code.Array_problem;

import java.util.*;

public class find_missingEle {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 6 };
        int n = nums[nums.length - 1];
        int[] nums1 = { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
        // System.out.println("Missing element from array is : " +
        // miss_ele.missing(nums, n));
        System.out.println("Missing element from array is : " + miss_ele.using_xor(nums, n));
        System.out.println("Maximum consicutive 1's are : " + miss_ele.consicutive(nums1));
    }
}

class miss_ele {
    static int missing(int[] nums, int n) {
        // brute solution a=[1,2,4,5]
        for (int i = 1; i <= n; i++) {
            int f = 0;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] == i) {
                    f++;
                    break;
                }
            }
            if (f == 0) {
                return i;
            }

        }

        return -1;
    }

    // Better soulting using hashing of array
    static int use_hashing(int[] a, int N) {
        // [1,2,4,5][0,0,0,0,0]
        int hash[] = new int[N + 1]; // hash array

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)
            hash[a[i]] += 1;

        // checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    // USing xor
    static int using_xor(int[] nums, int n) {
        /*
         * XOR1 will be xoring array element whose element are from index 0 to n-2 as
         * one element is missing
         */
        int xor1 = 0;
        /* XOR2 will be xoring element 1 to n i.e. 1,2,3,4,5,...,n-1,n */
        int xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i + 1);
        }
        xor2 = xor2 ^ n;
        return xor1 ^ xor2;
    }

    // Maximum consicutive 1's in given array
    static int consicutive(int[] nums) {
        int maxi = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            /*
             * For every i value it will check if i=1 if yes the cnt will be raise by one
             * and set "maxi" = max between maxi and count else count become zero
             */
            if (nums[i] == 1) {
                cnt += 1;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }
        return maxi;
    }
}
