package code.Array_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class rotate_left {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 7, 6 };
        int n = a.length;
        // rotate.basic_solution(a, n, 3);
        rotate.optimized(a, 3);
        // rotate.revrse(a, 0, 3);
    }
}

class rotate {
    static void basic_solution(int[] nums, int n, int d) {
        /*
         * d is number of element we want to rotate to left, consider we have to rotate
         * n times which is basically length of array. Then after nth time array will
         * return to its original position.
         * say n=7 and d =8, than means rotate array by one place to left than original
         * how we find 1? -> d%n = 8%7=1
         * caluculate for d=18 n = 7(18%7=4 position to rotate)
         */
        d = d % n;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            temp.add(nums[i]);// created temp array till d
        }

        // shift remaining element by d to the left
        for (int i = d; i < nums.length; i++) {
            nums[i - d] = nums[i];
        }
        // add remaining element from n-d
        for (int i = n - d; i < nums.length; i++) {
            nums[i] = temp.get(i - (n - d));
        }
        System.out.println(Arrays.toString(nums));
    }

    static void optimized(int[] nums, int d) {
        revrse(nums, 0, d);
        revrse(nums, d + 1, nums.length - 1);
        revrse(nums, 0, nums.length - 1);
    }

    static void revrse(int[] a, int i, int j) {

        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
            i++;
        }
        System.out.println(Arrays.toString(a));
    }

}