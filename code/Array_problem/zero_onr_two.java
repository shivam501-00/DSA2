package code.Array_problem;

import java.util.Arrays;

public class zero_onr_two {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 0, 1, 0, 0, 1, 2, 2, 1, 2, 0, 2 };
        int n = nums.length;
        System.out.println("Sorted array of element 0,1,2 is as follows :");
        System.out.println(Arrays.toString(better_sol_zero_one_two(nums, n)));
    }

    static int[] better_sol_zero_one_two(int[] nums, int n) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 0) {
                c1++;
            } else if (nums[i] == 1) {
                c2++;
            } else if (nums[i] == 2) {
                c3++;
            }
        }
        for (int i = 0; i < c1; i++) {
            nums[i] = 0;
        }
        for (int i = c1; i < c1 + c2; i++) {
            nums[i] = 1;
        }
        for (int i = c1 + c2; i < n; i++) {
            nums[i] = 2;
        }
        return nums;
    };

}
