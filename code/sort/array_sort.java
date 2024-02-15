package code.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * selection_sort
 */
public class array_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array: ");

        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter element of array");
        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        // sort.selection_sort(a, n);
        // sort.bubble_sort(a, n);
        sort.insertion_sort(a, n);

    }

}

class sort {
    static void selection_sort(int[] a, int n) {

        for (int i = 0; i <= n - 2; i++) {
            // [2,3,1,5,7,6,9,2]
            int min = i;
            // we only run inner for loop to check if any other min values present on right
            // side of array than i.
            for (int j = i; j <= n - 1; j++) {

                if (a[j] < a[min]) {
                    min = j; // if any value at any j th index is present smaller than min. set min as it.
                }
            }
            // swapping nothing else but after checking if there any
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }
        System.out.println(Arrays.toString(a));
    }

    /// Bubble sort
    static void bubble_sort(int[] a, int n) {

        /*
         * In this we sort right side of array and consider two elelment which if first
         * elemnt is greater than next element then swap
         */

        for (int i = n - 1; i >= 0; i--) {
            int swap = 0;// optimization
            for (int j = 0; j <= i - 1; j++) {
                // We run inner loop to check adjucent element and swap them if first is larger
                // than next

                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
                swap += 1;
            }

            if (swap == 0) {
                System.out.println(swap);
                break;
            }

        }
        System.out.println(Arrays.toString(a));
    }

    static void insertion_sort(int[] a, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;

            while (j > 0 && a[j - 1] > a[j]) {
                int t = a[j];
                a[j] = a[j - 1];
                a[j - 1] = t;
                j--;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
