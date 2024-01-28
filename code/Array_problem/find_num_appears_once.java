package code.Array_problem;

import java.util.*;

// Find Numbers that appears once 

public class find_num_appears_once {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        System.out.println("Number appears once is : " + Inner_find_num.brute_sol_appears_once(nums));
        System.out.println("Number appears once is : " + Inner_find_num.Using_xor(nums));
    }

}

/**
 * Inner_find_num_appears_once
 */
class Inner_find_num {
    /*
     * Brute solution: itreate through given array. for every element check if it
     * appears twice if yes increase cnt. if for any num count remains 1 return it
     */
    static int brute_sol_appears_once(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];

            }
        }
        return -1;
    }

    // Using XOR
    static int Using_xor(int[] nums) {
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;

    }
}
