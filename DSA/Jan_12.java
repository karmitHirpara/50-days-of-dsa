package DSA;

// Leetcode 3803. Count Residue Prefixes
// ``````````````````````````````````````

public class Jan_12 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(residuePrefixes(s));
    }

    private static int residuePrefixes(String s) {
        int ans = 0, c = 0;
        int []a = new int[26];
        int n = 0;
        for(int i = 0; i<s.length(); i++){
            int ascii = s.charAt(i)-'a';
            if(a[ascii] == 0) c++;

            if((i+1)%3 == c) ans++;
            
            a[ascii]++;
        }
        return ans;
    }
}
