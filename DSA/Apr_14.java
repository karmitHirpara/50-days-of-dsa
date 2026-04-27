package DSA;

// LeetCode 3694. Find the Degree of an Array

// ```````````````````````````````````````````
import java.util.Arrays;

public class Apr_14 {
     public static void main(String[] args) {
     {
        int a[][] = {{0,1,0},{0,0,1},{1,0,0}};
        int ans[] = findDegrees(a);
        System.out.println(Arrays.toString(ans));
    }

     private static int[] findDegrees(int[][] a) {
        for(int i = 0; i<a.length; i++){
            a[0][i] = (int) Arrays.stream(a[i]).sum();
        }
        return a[0];
    }
}
