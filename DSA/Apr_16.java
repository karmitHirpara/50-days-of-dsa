package DSA;

// LeetCode 3867. Sum of GCD of Formed Pairs
// ``````````````````````````````````````````

public class Apr_16 {
    public static void main(String[] args) {
        int a[] = {2,6,4};
        long ans = gcdSum(a);
        System.out.println(ans);
    }

    private static long gcdSum(int[] a) {
        int b[] = new int[a.length];
        int max = a[0];
        for(int i = 0; i<a.length; i++){
            max = Math.max(a[i], max);
            int gcd = getGCD(max, a[i]);
            b[i] = gcd;
        }
        Arrays.sort(b);
        long sum = 0l;
        for(int i = 0; i<a.length/2; i++){
            sum += getGCD(b[i], b[a.length-i-1]);
        }
        return sum;
    }

    private static int getGCD(int a, int b){
        if(b == 0) return a;
        return getGCD(b, a%b);
    }
}
