package DSA;

// Leetcode Contest Problem
// `````````````````````````


public class Dec_31 {
    public static void main(String[] args) {
        int []a = {2,3,1,5,4};
        System.out.println(maximumScore(a));
    }

    private static long maximumScore(int[] a) {
        long []suffix = new long[a.length];
        long max = Long.MIN_VALUE, right = 0;
        int min = Integer.MAX_VALUE;
        for(int i = a.length-1; i>=0; i--) {
            suffix[i] = min = Math.min(a[i], min);
        }
        for (int i = 0; i <a.length-1; i++) {
            long sfixMin = suffix[i+1];
            right += a[i];
            max = Math.max(max, right-sfixMin);
        }
        
        return max;
    }
}