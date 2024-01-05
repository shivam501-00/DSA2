package code;

import java.util.Scanner;

/**
 * patter
 */
public class patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number : ");
        int n = sc.nextInt();

        Pt.pattern(n);
        Pt.pattern2(n);
        Pt.pattern3(n);
        Pt.pattern4(n);
        Pt.pattern5(n);
        Pt.pattern6(n);
        Pt.pattern7(n);
        Pt.pattern8(n);
        Pt.pattern9(n);
        int[] b = { 1, 44, 8, 6, 7, 99, 5, 33, 47, 56, 227, 1000 };
        int la = Pt.large_num(b);
        // System.out.println(b);
        // int l = Pt.findLargestNumber(b);
        System.out.println(la);
        // int z = Integer.MIN_VALUE;
        // System.out.println(z);

    }
}

/**
 * class for methods of pattern
 */
class Pt {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");// VVIMP: while printing pattern on same line we use .print(), cuz if we use
                                       // println() first line will print in straight vertical line as every * will
                                       // print in new line

            }
            System.out.println();
        }
    }

    // pattern2

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    // pattern3
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    // pattern 4
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 5
    // *****
    // ****
    // ***
    // **
    // *
    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern 6
    // 5 4 3 2 1
    // 5 4 3 2
    // 5 4 3
    // 5 4
    // 5
    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 7
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // pattern 8

    /*
     * for n = 5, in first line if we see there are total of 5 space front then 1
     * star and then 5 space i.e[5 1 5]
     * same if we count for all rows we see
     * [5 1 5]
     * [4 3 4]
     * [3 5 3]
     * [2 7 2]
     * [0 11 0]
     * so if we see for space we get formula
     * no of space = n-i+1
     */
    static void pattern8(int n) {
        for (int i = 0; i <= n; i++) {
            // space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // pattern 9

    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * n - (2 * i - 1); j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    // ---------------------------------------
    // large num in array
    static int large_num(int[] a) {
        if (a == null || a.length == 0) {
            // Handle the case where the array is null or empty
            throw new IllegalArgumentException("Array is null or empty");
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] >= max) {
                max = a[i];
            }
            // return max;

        }
        // System.out.println(max);
        return max;
    }
}
