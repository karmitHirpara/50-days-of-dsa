package DSA;

// LeetCode 3775. Reverse Words With Same Vowel Count
// ```````````````````````````````````````````````````

import java.util.Arrays;
import java.util.stream.Collectors;

public class Dec_18 {
    public static void main(String[] args) {
        String s = "cat and mice";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String a[] = s.split(" ");
        int fix = countAscii(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (countAscii(a[i]) == fix) {
                StringBuilder temp = new StringBuilder(a[i]);
                a[i] = temp.reverse().toString();
            }
        }
        return Arrays.stream(a).collect(Collectors.joining(" "));
    }

    private static int countAscii(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (
                    s.charAt(i) == 'a' ||
                            s.charAt(i) == 'e' ||
                            s.charAt(i) == 'i' ||
                            s.charAt(i) == 'o' ||
                            s.charAt(i) == 'u'
            ) {
                c++;
            }
        }
        return c;
    }
}
