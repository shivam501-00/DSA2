import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution {

    static int partition(List<Integer> arr, int low, int high) {
        // define pivot
        int pivot = arr.get(low);
        // difine pointers i and j
        int i = low;
        int j = high;
        while (i < j) {
            /*
             * Below while loop will check element higher than pivot and stop at there and
             * it's index will be 'i'
             */
            while (arr.get(i) <= pivot && i < high) {
                i++;
            }
            /*
             * This while loop will check element lower that picot and stop over there and
             * it's index will be 'j'
             */
            while (arr.get(j) > pivot && j > low) {
                j--;
            }
            /*
             * Once we find out element greater than pivot from right and smaller element
             * from left till i crosses j or vice versa we can swap these two with each
             * other.
             * NOTE: remeber we are swapping small and large element and not pivot in this
             * while(i<j) loop
             */

            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        /*
         * As we get out of while loop that means our pointer has crossed each other and
         * now we need to adjust our pivot to j as j is smaller has smaller element than
         * pivot
         */

        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);

        return j;

    }

    static void QS(List<Integer> arr, int low, int high) {
        /*
         * remember we can only run this for List/array having more than 1 element
         * therefor if() comes in picture
         */
        if (low < high) {
            /*
             * In partition method we will add main code of sorting and get Pivots index i.e
             * pIndex from it
             */
            int pIndex = partition(arr, low, high);
            /*
             * Calling same function recursivly for sorting left and right side arrays of
             * pivot
             */
            QS(arr, low, pIndex - 1);
            QS(arr, pIndex + 1, high);
        }
    }

    public static List<Integer> quick_Sort(List<Integer> arr) {
        // Write your code here.
        QS(arr, 0, arr.size() - 1);
        return arr;
    }

}

public class Quick_sort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] { 4, 6, 4, 2, 5, 7, 9, 1, 3 });
        int n = arr.size();
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = solution.quick_Sort(arr);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
