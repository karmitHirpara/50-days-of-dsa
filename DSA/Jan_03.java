package DSA;

// LeetCode 49. Group Anagrams
// ````````````````````````````

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Jan_03 {
    public static void main(String[] args) {
        String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(a));
    }

    public static List<List<String>> groupAnagrams(String[] a) {
        String []b = new String[a.length];
        for (int i = 0; i < a.length; i++) b[i] = ascii(a[i]);
        List<String> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            list = new ArrayList<>();
            String sorted_String = b[i];
            if(map.containsKey(sorted_String)){
                list = map.get(sorted_String);
                list.add(a[i]);
                map.put(sorted_String, list);
            }else{
                list.add(a[i]);
                map.put(sorted_String, list);
            }
        }
        return new ArrayList<>(map.values());
    }

    private static String ascii(String s) {
        int []a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i)-'a';
            a[ascii]++;
        }
        String ans = "";
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                String temp = (char)(i+'a') + "";
                temp = temp.repeat(a[i]);
                ans += temp;
            }
        }
        return ans;
    }
}
