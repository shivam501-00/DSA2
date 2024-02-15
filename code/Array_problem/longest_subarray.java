package code.Array_problem;

//longest subarray with sum K with array of positive numbers 

public class longest_subarray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 3, 1, 1, 1, 1, 3 };
        int n = a.length;
        System.out.println("Longest subarray with sum 3 " + brute_l_sub(a, 4, n));

    }
    // brute approach

    static int brute_l_sub(int[] a, int k, int n) {
        // [1,2,1,3,1,1,1,3]
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                /*
                 * in if we are checking that if sum from i to j is k. then we compare len with
                 * new lenght whichever is max
                 */
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

}
