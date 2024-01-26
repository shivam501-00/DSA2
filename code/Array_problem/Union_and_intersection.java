package code.Array_problem;

import java.util.ArrayList;

/**
 * InnerUnion_and_intersection
 */
class InnerUnion_and_intersection {
    static ArrayList<Integer> unionofArray(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (ans.isEmpty() || a[i] != ans.get(ans.size() - 1)) {
                    ans.add(a[i]);
                    i++;
                }

            } else if (b[j] < a[i]) {
                if (ans.isEmpty() || b[j] != ans.get(ans.size() - 1)) {
                    ans.add(b[j]);
                    j++;
                }

            }
        }
        // when one of the array get exhausted
        while (i < n1) {
            if (ans.isEmpty() || a[i] != ans.get(ans.size() - 1)) {
                ans.add(a[i]);
                i++;
            }

        }
        while (j < n2) {
            if (ans.isEmpty() || b[j] != ans.get(ans.size() - 1)) {
                ans.add(b[j]);
                j++;
            }

        }
        return ans;
    }

}

public class Union_and_intersection {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 4, 6, 8, 10, 11 };
        int[] b = { 0, 3, 4, 9, 10, 14, 15, 16 };
        System.out.println("its running....");
        ArrayList<Integer> ans = InnerUnion_and_intersection.unionofArray(a, b);
        for (Integer e : ans) {
            System.out.println(e + " ");
        }

    }
}
