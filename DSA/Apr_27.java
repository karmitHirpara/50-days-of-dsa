package DSA;

import java.util.ArrayList;
import java.util.List;  

// LeetCode 3912. Valid Elements in an Array
// ``````````````````````````````````````````

public class Apr_27 {
    public static void main(String[] args) {
        int a[] = {1,2,4,2,3,2};
        List<Integer> result = findValidElements(a);
        System.out.println(result);
    }

    private static List<Integer> findValidElements(int[] a) {
        List<Integer> list = new ArrayList<>(a.length);
        int []left = new int[a.length];
        int []right = new int[a.length];

        int maxl = 1;
        for(int i = 1; i<a.length; i++){
                left[i] = Math.max(a[i-1], left[i-1]);
        }
        int maxr = 1;
        for(int i = a.length-2; i>=0; i--){
                right[i] = Math.max(right[i+1], a[i+1]);
        }

        for(int i = 0; i<a.length; i++){
            if(i == 0 || i == a.length-1 || a[i]>left[i] || a[i]>right[i]) list.add(a[i]);
        }
        return list;
    }
}