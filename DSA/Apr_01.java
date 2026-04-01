package DSA;

// Leetcode 3884. First Matching Character From Both EndsI
// ````````````````````````````````````````````````

public class Apr_01 {
    public static void main(String[] args) {
        String s = "abcacbd";
        System.out.println(firstMatchingIndex(s));
    }

    private static int firstMatchingIndex(String s) {
        for(int i = 0; i<=s.length()/2; i++){
            if(s.charAt(i) == s.charAt(s.length()-i-1)){
                return i;
            }
        }
        return -1;
    }
}