# TWO_SUM

## Brute Solution

- Basic idea was to check sum of each element with every other element of array. 
- Uses two for loops, which means Time Complexity will be O(n^2)

```java
//For Yes_or_No
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

// For returning index array
 static int[] brute_sol_index(int[] a, int t, int n) {
        int[] index = new int[2];
        index[0] = -1;
        index[1] = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j == i) {
                    continue;
                }
                if (a[i] + a[j] == t) {
                    index[0] = i;
                    index[1] = j;

                }
            }
        }
        return index;
    }

```

## Better Solution

- Better solution is to use datastructure like Hashmap to store previous records and check accordingly
- Time complexity is O(n.log n), and Space Complexity O(log n).

``` java
// for yes or no
static void better_sol_yes_or_no(int[] a, int t, int n) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int remaining = t - a[i];
            if (mpp.containsKey(remaining)) {
                System.out.println("Yes");
                return;
            } else {
                mpp.put(a[i], i);
            }
        }
        System.out.println("No");
    }
//for returning index array
    static int[] better_sol_index(int[] a, int t, int n) {
        int[] index = new int[2];
        index[0] = -1;
        index[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int remaining = t - a[i];
            if (mpp.containsKey(remaining)) {
                index[0] = i;
                index[1] = mpp.get(remaining);
            } else {
                mpp.put(a[i], i);
            }
        }
        return index;
    };

```

## Optimal solution 

- Two Pointer approch 
- Only applicable in Yes or No In sorted array.
- check sum of right most and leftmost element if its greater than target come one position down from right or if it is greater come one position up from left 

```java
static void optimal_sol_yes_or_no(int[] a, int t, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (a[left] + a[right] == t) {
                System.out.println("Yes");
                return;
            } else if (a[left] + a[right] < t) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No");
    };


```