import java.util.*;

class solutionOc {
    /**
     * @param nums
     * @param t
     * @return
     */
    static int[] firstandlast(int[] nums, int t) {
        int low = 0;
        int high = nums.length - 1;
        int[] result = { -1, -1 };
        /* if array is null or has 0 elements */
        if (nums == null || nums.length == 0) {
            return result;
        }
        /*
         * Intution of problem is we have to find Leftindex and rightindex which must be
         * first appearance and last appearance of target element considering array is
         * sorted
         */
        int lindex = firstOccurance(nums, t);
        if (lindex == -1) {
            return result;
        }
        int rindex = lastOccurance(nums, t);
        result[0] = lindex;
        result[1] = rindex;

        return result;
    }

    static int firstOccurance(int[] nums, int t) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == t) {
                result = mid;
                high = mid - 1;
            } else if (nums[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return result;
    }

    static int lastOccurance(int[] nums, int t) {

        int low = 0;
        int high = nums.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == t) {
                result = mid;
                low = mid + 1;
            } else if (nums[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return result;

    }

}

public class occurence {
    public static void main(String[] args) {
        /*
         * we need to find first and last appearnce of target element in array return
         * its indexes and if no target found / array is null return {-1,-1}
         * NOTE: array is sorted
         */
        int[] a = { 5, 7, 7, 8, 8, 10 };
        System.out.println(
                "first and last index for given target are : " + Arrays.toString(solutionOc.firstandlast(a, 8)));
    }

}
