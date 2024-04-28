package code.Array_problem;

import java.util.*;

public class two_sum {
    public static void main(String[] args) {

        int[] a = { 2, 5, 6, 7, 8, 11 };
        int n = a.length;
        int t = 14;
        System.out.println("Yes or No: ");
        brute_sol_yes_or_no(a, t, n);
        System.out.println(Arrays.toString(brute_sol_index(a, t, n)));
        System.out.println("Yes or No: ");
        better_sol_yes_or_no(a, t, n);
        System.out.println(Arrays.toString(better_sol_index(a, t, n)));
        // Only when array is sorted
        System.out.println("Yes or No: ");
        optimal_sol_yes_or_no(a, t, n);

    }

    static void brute_sol_yes_or_no(int[] a, int t, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j == i) {
                    continue;
                }
                if (a[i] + a[j] == t) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");

    }

    static int[] brute_sol_index(int[] a, int t, int n) {
        int[] index = new int[2];
        index[0] = -1;
        index[1] = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j == i) {
                    continue;
                }
                if (a[i] + a[j] == t) {
                    index[0] = i;
                    index[1] = j;

                }
            }
        }
        return index;
    }

    static void better_sol_yes_or_no(int[] a, int t, int n) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int remaining = t - a[i];
            if (mpp.containsKey(remaining)) {
                System.out.println("Yes");
                return;
            } else {
                mpp.put(a[i], i);
            }
        }
        System.out.println("No");
    }

    static int[] better_sol_index(int[] a, int t, int n) {
        int[] index = new int[2];
        index[0] = -1;
        index[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int remaining = t - a[i];
            if (mpp.containsKey(remaining)) {
                index[0] = i;
                index[1] = mpp.get(remaining);
            } else {
                mpp.put(a[i], i);
            }
        }
        return index;
    };

    static void optimal_sol_yes_or_no(int[] a, int t, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (a[left] + a[right] == t) {
                System.out.println("Yes");
                return;
            } else if (a[left] + a[right] < t) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No");
    };
}