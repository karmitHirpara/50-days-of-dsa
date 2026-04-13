package DSA;

// LeetCode 1848. Minimum Distance to the Target Element
// ``````````````````````````````````````````````````````

public class Apr_11 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int target = 5, start = 3;
        int ans = getMinDistance(a, target, start);
        System.out.println(ans);
    }

    private static int getMinDistance(int[] a, int t, int s) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<a.length; i++){
            if(a[i] == t){
                min = Math.min(min, Math.abs(i-s));
            }
        }

        return min;
    }
}