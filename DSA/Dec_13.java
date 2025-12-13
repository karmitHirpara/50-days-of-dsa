package DSA;

// LeetCode 3750. Minimum Number of Flips to Reverse Binary String
// ````````````````````````````````````````````````````````````````

public class Dec_13 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(minimumFlips(n));
    }
    
    private static int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int c = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                c++;
            }
        }
        return c;
    }
}


