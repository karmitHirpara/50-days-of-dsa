package DSA;

// Leetcode 3761. Minimum Absolute Distance Between Mirror Pairs
// ``````````````````````````````````````````````````````````````

import java.util.HashMap;
public class Apr_18 {

    public static void main(String[] args) {
        int a[] = {1, 23, 456, 321, 54};
        int ans = minMirrorPairDistance(a);
        System.out.println(ans);
    }

    public static int minMirrorPairDistance(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i = a.length-1; i>=0; i--){
            int rev = rev(a[i]);
            if(map.containsKey(rev)){
                int getRev = map.get(rev);
                min = Math.min(min, getRev-i);
            }
            map.put(a[i], i);
        }        

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private static int mirrorDistance(int n) {
        int rev = rev(n);
        return abs(rev - n);
    }

    private static int abs(int n){
        return (n>0) ? n : n*-1;  
    }

    private static int rev(int n){
        StringBuilder sb = new StringBuilder(n+"");
        return Integer.parseInt(sb.reverse().toString());
    }
    
}
