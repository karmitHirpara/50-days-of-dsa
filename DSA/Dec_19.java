package DSA;

// LeetCode 3774. Absolute Difference Between Maximum and Minimum K Elements
// ``````````````````````````````````````````````````````````````````````````

import java.util.Arrays;

public class Dec_19 {
    public static void main(String[] args) {
        int a[] = {5, 2, 2, 4};
        int k = 2;
        System.out.println(absDifference(a, k));
    }

    public static int absDifference(int[] a, int k) {
        Arrays.sort(a);
        int sumLeft = 0, sumRight = 0;
        for(int i = 0; i<k && i<a.length; i++){
            sumLeft += a[i];
            sumRight += a[a.length-i-1];
        }
        return sumRight-sumLeft;
    }
}
