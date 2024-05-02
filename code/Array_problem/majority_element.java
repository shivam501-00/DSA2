package code.Array_problem;

import java.util.HashMap;
import java.util.Map;

/**
 * majority_element
 */
public class majority_element {

    public static void main(String[] args) {
        /*
         * Problem : find element that appears >n/2 times in array, where n is lenght of
         * array
         */
        int[] nums = { 2, 2, 1, 5, 2, 2, 2, 2, 6, 8, 2, 5, 1, 2 };
        int n = nums.length;
        // System.out.println(brute_sol_majority_ele(nums, n));
        System.out.println(majorityElement(nums));
        System.out.println(optimal_majority_ele(nums, n));

    }

    static int brute_sol_majority_ele(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    static int majorityElement(int[] v) {
        // size of the given array:
        int n = v.length;

        // declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        // searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }

    static int optimal_majority_ele(int[] nums, int n) {
        int cnt = 0;
        int el = nums[0];
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                el = nums[i];
                cnt++;
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }
        if (cnt1 > (n / 2)) {
            return el;
        }
        return -1;
    }
}
