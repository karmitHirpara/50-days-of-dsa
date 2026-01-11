package DSA;

// Leetcode 84. Largest Rectangle in Histogram
// ````````````````````````````````````````````

public class Jan_11 {
    public static void main(String[] args) {
        int a[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(a));
    }

    private static int largestRectangleArea(int[] a) {
        int n = a.length, j = -1;
        int []stk = new int[n+1];
        int max = -99999999;
        for(int i = 0; i<=a.length; i++){
            int cur = (i == n) ? 0 : a[i];
            while(j != -1 && a[stk[j]] > cur){
                int h = a[stk[j--]];
                int prvSmallest = (j == -1) ? -1 : stk[j];
                int w = i-prvSmallest-1;
                max = Math.max(max, h*w);
            }
            stk[++j] = i;
        }
        return (max == -99999999) ? 0 : max;
    }
}