package code;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array a before sorting : " + Arrays.toString(a));
        System.out.println(" ");
        Sort_merge.merge_sorting(a, 0, n - 1);
        System.out.println("Array after sorting is :" + Arrays.toString(a));
        sc.close();
    }

}

/**
 * Sort
 */
class Sort_merge {

    private static void merg(int[] a, int low, int mid, int high) {
        // create new array list to add element after sorting
        ArrayList<Integer> temp = new ArrayList<>();
        // assign pointers to first element of left and right array
        int l = low;
        int r = mid + 1;

        /*
         * while element are present in both side sorted array we want to compare
         * element from both arrays with each other and add which ever element is small
         * first
         * NOTE: considering both side arrays are sorted we don't need to check element
         * in same array.
         */
        while (l <= mid && r <= high) {
            if (a[l] <= a[r]) {
                temp.add(a[l]);
                l++;
            } else {
                temp.add(a[r]);
                r++;
            }
        }
        /*
         * If right side array get exauhsted completely then simply add remaining left
         * side array element without checking as the are already sorted
         */
        while (l <= mid) {
            temp.add(a[l]);
            l++;
        }
        // Vice versa for remaining right side element
        while (r <= high) {
            temp.add(a[r]);
            r++;
        }
        /*
         * All this addintion of element takes place in temp arraylist so add same
         * ordered sorted element in array
         */
        for (int i = low; i <= high; i++) {
            a[i] = temp.get(i - low);
        }
    }

    public static void merge_sorting(int[] a, int low, int high) {
        // base case
        if (low >= high) {
            return;
        }
        // find out point from which we want to break array
        int mid = (low + high) / 2;
        // call same function recursivly for two newly created array with help of mid
        merge_sorting(a, low, mid);
        merge_sorting(a, mid + 1, high);
        // merge array once it get seperated till base case.
        merg(a, low, mid, high);
    }
}