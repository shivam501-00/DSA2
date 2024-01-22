package code.Array_problem;

import java.util.*;

class ans {
    static void findSecondlargest(int[] nums) {
        int largest = nums[0];
        int sec_largest = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                sec_largest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > sec_largest) {
                sec_largest = nums[i];
            }
        }
        System.out.println("Second largest element of given array is " + sec_largest);
    }

    static boolean checkArraysorted(int[] nums) {
        boolean isSorted = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {

            } else {
                isSorted = false;
            }
        }
        return isSorted;
    }

    // remove duplicates from from sorted array
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    static int[] removeDup(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return nums;
    }

}

public class second_largest {

    public static void main(String[] args) {
        int[] nums = { 5, 8, 7, 9, 12, 6, 4, 10, 13, 12 };
        int[] nums1 = { 5, 5, 5, 8, 8, 8, 9, 9, 10, 15, 15, 50, 62, 1000 };

        ans.findSecondlargest(nums);
        System.out.println(ans.checkArraysorted(nums1));
        Set<Integer> set = new HashSet<>();
        System.out.println(Arrays.toString(ans.removeDup(nums1)));
        System.out.println(ans.removeDuplicates(nums));

    }
}