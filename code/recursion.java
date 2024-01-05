package code;

import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {
        // mt.func(0);
        // mt.pr_name("Shivam", 0);
        // mt.pr_linnum(8, 1);
        // mt.pr_revnum(10);
        // mt.pr_numwtBt(10);
        // mt.pr_revBTnum(8, 1);
        // mt.sumOfN(8, 0);
        // System.out.println(mt.sumOfNum(0));
        // System.out.println(mt.factorial(4));
        // int[] arr = { 1, 3, 4, 8, 9, 7 };
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr.length);MISTAKE REFER METHOD FOR USE OF
        // Arrays.toString(arr) method
        // mt.reverseArr(arr, 0, 6);
        // mt.withoutPt(arr, 0);
        // System.out.println(mt.palindrom("saas", 0));
        // ASCII values
        int x = 's';
        System.out.println(x);

    }
}

// methods for printing number of times function run

class mt {
    // print count
    static void func(int count) {
        /*
         * int count = 0; MISTAKE: I initialize count var inside function at start of
         * func, beacause of which even though count++ is excecuting when func get
         * called again, its value becomes zero again and goes in infinite loop
         * Instead just give it as an argument and while calling it in main give
         * initial value as zero
         */

        // BAse condition
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        func(count);
    }

    // Print name 5 times
    static void pr_name(String name, int count) {
        if (count == 5) {
            return;
        }
        System.out.println(name);
        count++;
        pr_name(name, count);
    }

    // Print 1 to n in linear way.
    static void pr_linnum(int n, int count) {
        /*
         * we want to print count until it becomes greater that the value that is given
         * by user
         */
        if (count > n) {
            return;
        }

        System.out.println(count);
        // n++;
        count++;
        pr_linnum(n, count);

    }

    // Print n to 1
    static void pr_revnum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // n++;
        n--;
        pr_revnum(n);
    }

    // print linearly from 1 to n (but by using backtrack i.e without using
    // increment )
    static void pr_numwtBt(int i) {
        /*
         * In this case we want to give value of i any number, let say 8. and want
         * function to return 1 to 8
         */
        if (i < 1) {
            return;
        }

        /*
         * when we call function before print, the next line will not print 8, rather i
         * will call function for next value which is 7 and same happen till i<1, once
         * it become less than one it will return and last function with i value 1 will
         * execute first
         */

        // pr_numwtinc(i--); MISTAKE: when we say i-- value of i will change to 9, if
        // given i=10.when function will return and value of i will remain same and
        // will call function with same value. there for loop will never end. rather use
        // --i or i-1 while calling function
        // pr_numwtinc(--i);
        pr_numwtBt(i - 1);
        System.out.println(i);

    }

    // print n to 1 by backtracking that means call function before print
    static void pr_revBTnum(int n, int count) {
        if (count > n) {
            return;
        }
        pr_revBTnum(n, count + 1);
        System.out.println(count);
    }

    // Sum of N numbers
    static void sumOfN(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfN(n - 1, sum + n);
    }
    // sum of N numbers using function

    static int sumOfNum(int n) {
        if (n == 0) {
            /*
             * this "return 0;" is really important as when base condition mate it has to
             * return zero.
             */
            return 0;
        } else {
            return n + sumOfNum(n - 1);
        }
    }

    // factorial of N number
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // revresing array using recursion
    // TWO POINTER METHOD
    static void reverseArr(int arr[], int l, int r) {
        if (l >= r) {
            /*
             * When you use System.out.println(arr) to print an array directly, you will get
             * the default toString() representation of the array object, which is not the
             * same as printing the elements of the array. It will print the hash code or
             * some other information about the array object.
             * rather use Arrays.toString(arr)
             */
            System.out.println(Arrays.toString(arr));
            return;
        }
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
        reverseArr(arr, l + 1, r - 1);

    }

    // WITHOUT USING TWO POINTERS
    static void withoutPt(int arr[], int i) {
        if (i >= (arr.length / 2)) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int t = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = t;
        withoutPt(arr, i + 1);
    }

    // check given string is palindrom or not (true or false)
    static boolean palindrom(String word, int i) {
        char[] arr = word.toCharArray();
        if (i > (arr.length / 2)) {
            return true;
        }
        if (arr[i] != arr[arr.length - i - 1]) {
            return false;

        }
        return palindrom(word, i + 1);
    }

}
