package DSA;

// LeetCode 242. Valid Anagram
// ``````````````````````````````````````````````````````````````````````````

public class Dec_20 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {
        int a[] = getAscii(s, t);
        for (int x : a) {
            if (x != 0)
                return false;
        }
        return true;

    }

    private static int[] getAscii(String s, String s1) {
        int a[] = new int[26];
        for (int i = 0; i < s.length() || i < s1.length(); i++) {
            if (i < s.length()) {
                int ascii = s.charAt(i) - 'a';
                a[ascii]++;
            }
            if (i < s1.length()) {
                int ascii = s1.charAt(i) - 'a';
                a[ascii]--;
            }
        }
        return a;
    }
}
