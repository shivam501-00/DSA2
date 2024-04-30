package code.Array_problem;

import java.util.Arrays;

public class zero_onr_two {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 0, 1, 0, 0, 1, 2, 2, 1, 2, 0, 2 };
        int n = nums.length;
        System.out.println("Sorted array of element 0,1,2 is as follows :");
        // System.out.println(Arrays.toString(better_sol_zero_one_two(nums, n)));
        System.out.println(Arrays.toString(optimal_sol_zero_one_two(nums, n)));

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

    static int[] optimal_sol_zero_one_two(int[] nums, int n) {
        int mid = 0;
        int high = n - 1;
        int low = 0;
        /*
         * -- Consider imaginary array which have value 0 for 0th to [low-1]th index,
         * have
         * 1 for [low]to [mid-1] index, have unordered array from [mid] to [high] and
         * have 2 for [high+1] to n-1 index
         * -- consider mid and low are both at zero th index at start , going forward we
         * need to check what value at mid index inarray is stored and accordingly shift
         * that value to its region and increase mid, low or decrease high accordingly.
         * -- (VIMP) as per regions we made in 1st point of this intution, low will
         * always have
         * 
         */
        while (mid <= high) {
            if (nums[mid] == 0) {
                int t = nums[low];
                nums[low] = nums[mid];
                nums[mid] = t;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int t = nums[mid];
                nums[mid] = nums[high];
                nums[high] = t;
                high--;
            }
        }
        return nums;
    }

}
