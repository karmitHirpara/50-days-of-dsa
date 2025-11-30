package DSA;

// LeetCode 707. Design Linked List
// ```````````````````````````````````````````````````````````````````````

import java.util.ArrayList;
import java.util.Arrays;

public class Nov_30 {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,4,5};
        int k = 3;
        int[] res = maxKDistinct(a, k);
        System.out.println(Arrays.toString(res));
    }

    private static int[] maxKDistinct(int[] a, int k) {
        Arrays.sort(a);
        int j = 0;
        for(int i = 1; i<a.length; i++){
            if(a[i] != a[j]){
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        ArrayList<Integer> list = new ArrayList<>(k);
        while(k != 0 && j>-1){
            list.add(a[j--]);
            k--;
        }
        a = new int[list.size()];
        for(int i = 0; i<a.length; i++) a[i] = list.get(i);
        return a;
    }
}
