// package code;

import java.util.ArrayList;

public class merge_sort {
    public static void main(String[] args) {
        int[] a = { 2, 1, 8, 5, 7, 3, 9 };
        int n = a.length;
        merge_sorting(a, 0, (n - 1));
    }

    static void merge_sorting(int[] a, int low, int high) {
        // base case
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        merge_sorting(a, low, mid);
        merge_sorting(a, mid + 1, high);
        merg(a, low, mid, high);
    }

    static void merg(int[] a, int low, int mid, int high) {
        // create new array list to add element after sorting
        ArrayList<Integer> arr = new ArrayList<>();
        // assign pointers to first element of left and right array
        int l = low;
        int r = mid + 1;

        while (l <= mid && r <= high) {
            if (a[l] <= a[r]) {
                arr.add(a[l]);
                l++;
            } else {
                arr.add(a[r]);
                r++;
            }
        }
        while (l <= mid) {
            arr.add(a[l]);
            l++;
        }
        while (r <= high) {
            arr.add(a[r]);
            r++;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = arr.get(i);
        }
    }
}
