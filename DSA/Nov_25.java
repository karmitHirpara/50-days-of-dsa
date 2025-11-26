package DSA;
// LeetCode 1015: Smallest Integer Divisible by K
// `````````````````````````````````````````````````````````````````````````````````````````
// Given a positive integer k, find the smallest positive integer n such that:
//  - n is divisible by k
//  - n only contains the digit '1' (in decimal)
// Return the length of n (number of 1's). If no such n exists, return -1.
//
// Idea:
// Build the number implicitly using remainder arithmetic:
// remainder = (remainder * 10 + 1) % k
// Count steps until remainder becomes 0.
//
// Observations:
// - If k is divisible by 2 or 5, it's impossible (return -1).
// - There will be a solution within at most k steps if it exists.
// Complexity: O(k) time, O(1) extra space.
// `````````````````````````````````````````````````````````````````````````````````````````

class Nov_25 {
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