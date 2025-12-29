package DSA;

// LeetCode 3. Longest Substring Without Repeating Characters
// ```````````````````````````````````````````````````````````

import java.util.HashMap;
import java.util.Map;

public class Dec_29 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                int get = map.get(ch);
                left = Math.max(left, get+1);
            }
            map.put(ch, i);
            max = Math.max(max, i-left+1);

        }
        return max;
    }
}
