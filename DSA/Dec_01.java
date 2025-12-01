package DSA;

// LeetCode 3692. Majority Frequency Characters
// `````````````````````````````````````````````````````````````````````````````````````````

import java.util.HashMap;

public class Dec_01 {
    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        String res = majorityFrequencyGroup(s);
        System.out.println(res);
    }
    private static String majorityFrequencyGroup(String s) {
        int c = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int get = map.getOrDefault(s.charAt(i), 0) + 1;
            map.put(s.charAt(i), get);
            c = Math.max(c, get);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : map.keySet()) {
            if (map.get(ch) == c) sb.append(ch);
        }
        HashMap<Integer, String> ans = new HashMap<>();
        for (char x : map.keySet()) {
            int get = map.get(x);
            String temp = "";
            if (!ans.containsKey(get)) {
                temp += x;
                ans.put(get, temp);
            } else {
                temp += ans.get(get) + x;
                ans.put(get, temp);
            }
        }
        String res = "";
        for (int x : ans.keySet()) {
            String get = ans.get(x);
            if (get.length() >= res.length()) {
                res = get;
            }
        }
        return res;
    }
}
