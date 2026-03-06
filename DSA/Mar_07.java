package DSA;

// Leetcode 1784. Check if Binary String Has at Most One Segment of Ones
// ``````````````````````````````````````````````````````````````````````

public class Mar_07 {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(checkOnesSegment(s));
    }

    private static boolean checkOnesSegment(String s) {
        int zero = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0') zero++;
            else break;
        }
        int zeroSecondTime = 0;
        if(zero == s.length()) return true;
        for(int i = zero; i<s.length(); i++){
            if(s.charAt(i) == '0') zeroSecondTime++;
            else if(zeroSecondTime>0) return false;
        }
        return true;
    }
}