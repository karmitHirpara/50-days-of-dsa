package DSA;

// Leetcode 3813. Vowel-Consonant Score
// `````````````````````````````````````

public class Jan_21 {
    public static void main(String[] args) {
        String s = "cooear";
        System.out.println(vowelConsonantScore(s));   
    }

    private static int vowelConsonantScore(String s) {
        int c = 0, v = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(isChar(ch)){
                if(isVowel(ch)) v++;
                else c++;
            } 
        }
        return (c>0) ? (int)Math.floor(v/c) : 0;
    }

    private static boolean isChar(char ch){
        return ch>='a' && ch<='z';    
    }

    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ;    
    }
}
