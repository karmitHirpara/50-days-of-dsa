package DSA;

// LeetCode 3731. Find Missing Elements
// --------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nov_27 {
    public static void main(String[] args) {
        int[] a = {3, 7, 1, 2, 8, 4, 5};
        List<Integer> res = findMissingElements(a);
        System.out.println(res);
    }

private static List<Integer> findMissingElements(int[] a) {
        Arrays.sort(a);
        List<Integer> list = new ArrayList<>();
        int j = a[0] + 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != j) {
                list.add(j);
                i--;
            }
            j++;
        }
        return list;
    }
}