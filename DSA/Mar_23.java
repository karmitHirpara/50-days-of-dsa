package DSA;

// Leetcode 3875. Construct Uniform Parity Array I
// ````````````````````````````````````````````````

public class Mar_23 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        System.out.println(uniformArray(a));
    }

    // Corrected code
    public static boolean uniformArray(int[] a) {
        return true;
    }

    /*
    First Dry Run Code
    public boolean uniformArray(int[] a) {
        int odd = 0, even = 0;
        for(int x : a){
            if(x%2==0) even++;
            else odd++;
        }

        return (odd == even) || (odd == 0 && even == a.length) || (even == 0 && odd == a.length);
    }
    */
}
