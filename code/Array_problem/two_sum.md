# TWO_SUM

## Brute Solution

- Basic idea was to check sum of each element with every other element of array. 
- Uses two for loops, which means Time Complexity will be O(n^2)

```java
- For Yes_or_No
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
```