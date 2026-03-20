package DSA;

// Leetcode 3567. Minimum Absolute Difference in Sliding Submatrix
// ````````````````````````````````````````````````````````````````

import java.util.Arrays;

public class Mar_20 {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 2;
        int ans[][] = minAbsDiff(a, k);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] minAbsDiff(int[][] a, int k) {
        int ans[][] = new int[a.length-k+1][a[0].length-k+1];

        for(int i = 0; i<=a.length-k; i++){
            for(int j = 0; j<=a[0].length-k; j++){
                ans[i][j] = findMinDiff(a, k, i, j);
            }
        }
        return ans;
    }

    private static int findMinDiff(int a[][], int k, int row, int col){
        int arr[] = new int[k*k];
        int idx = 0;
        for(int i = row; i<row+k; i++){
            for(int j = col; j<col+k; j++){
                arr[idx++] = a[i][j];
            }
        }
        
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE, prv = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == prv) continue;
            min = Math.min(min, Math.abs(arr[i]-prv));
            prv = arr[i];
        }

        return (Integer.MAX_VALUE == min) ? 0 : min;
    }
}
