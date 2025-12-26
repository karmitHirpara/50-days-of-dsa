package DSA;

// Leetcode 4. Median of Two Sorted Arrays
// ````````````````````````````````````````

import java.util.Arrays;

public class Dec_26 {
    public static void main(String[] args) {
        int []a = {1,3};
        int []b = {2};
        System.out.println(findMedianSortedArrays(a,b));
    }
    
    private static double findMedianSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        int j = 0;
        for (int i = 0; i < a.length ; i++) {
            c[j++] = a[i];
            
        }
        for (int i = 0; i < b.length; i++) {
            c[j++] = b[i];
        }
        Arrays.sort(c);
        if(c.length%2!=0){
            return(c[c.length/2]);
        }
        else {
            double x = (c[c.length/2] + c[(c.length/2)-1]);
            return x/2; 
        }
    }
}
