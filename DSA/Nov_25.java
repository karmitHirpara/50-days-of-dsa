package DSA;
// LeetCode 1015: Smallest Integer Divisible by K
// `````````````````````````````````````````````````````````````````````````````````````````

class Nov_25 {
    public static void main(String[] args) {
        int k = 3;
        int res = smallestRepunitDivByK(k);
        System.out.println(res);
    }
    private static int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        
        int rem = 0;
        for(int i = 0; i<k; i++){
            rem = ((rem*10)+1)%k;
            if(rem%k==0) return ++i;
        }
        return -1;
    }
}