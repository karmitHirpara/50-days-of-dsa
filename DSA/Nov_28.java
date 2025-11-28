package DSA;

// LeetCode 16. 3Sum Closest
// `````````````````````````````````````````````````````````````````````````````````````````

import java.util.Arrays;

public class Nov_28 {
    public static void main(String[] args) {
        int[] a = {-1, 2, 1, -4};
        int t = 1;
        int res = threeSumClosest(a, t);
        System.out.println(res);  
    }
    public static int threeSumClosest(int[] a, int t) {
        Arrays.sort(a);

        int ans = a[0] + a[1] + a[2];

        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1, r = a.length - 1;
            while (l < r) {
                int sum = a[i] + a[l] + a[r];
                int curDiff = Math.abs(sum - t);
                int ansDiff = Math.abs(ans - t);
                if (curDiff < ansDiff) {
                    ans = sum;
                }

                if (sum == t) return sum;
                else if (sum > t) r--;
                else l++;
            }
        }
        return ans;
    }
    
}
