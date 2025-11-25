//1015:) Smallet integer divisible by K

// --------------------------------------------------------------------
// Given a positive integer k, you need to find the smallest positive integer n such that
// n is divisible by k, and n only contains the digit 1.
// Return the length of n. If there is no such n, return -1.
// --------------------------------------------------------------------

class Nov_24 {
    public static void main(String[] args) {
        int k = 3;
        int res = smallestRepunitDivByK(k);
        System.out.println(res);
    }
    public static int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        
        int rem = 0;
        for(int i = 0; i<k; i++){
            rem = ((rem*10)+1)%k;
            if(rem%k==0) return ++i;
        }
        return -1;
    }
}