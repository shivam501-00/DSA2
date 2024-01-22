package code.Array_problem;

import java.util.Arrays;

public class shiftZero {
    public static void main(String[] args) {
        int[] a = { 1, 0, 2, 0, 3, 0, 0, 4, 6 };
        System.out.println(Arrays.toString(shift_zero.sshifting(a)));

    }

}

class shift_zero {
    // My Solution with diffect
    /*
     * static int[] shifting(int[] nums) {
     * int i = 0;
     * int j = nums.length - 1;
     * while (i < nums.length && j >= 0) {
     * if (nums[i] != 0) {
     * i++;
     * j--;
     * } else if (nums[i] == 0 && nums[j] != 0) {
     * int temp = nums[i];
     * nums[i] = nums[j];
     * nums[j] = temp;
     * j--;
     * i++;
     * } else if (nums[i] == 0 && nums[j] == 0) {
     * j--;
     * }
     * }
     * 
     * return nums;
     * 
     * }
     */

    // striver approch
    static int[] sshifting(int[] nums) {
        // let assign index value for first zero in array as j
        int j = -1;

        // Search for first zero and store its index as j
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;

    }
}
