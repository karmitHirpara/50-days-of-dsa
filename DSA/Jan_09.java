package DSA;

// LeetCode 17. Letter Combinations of a Phone Number
// ```````````````````````````````````````````````````

import java.util.ArrayList;
import java.util.List;

public class Jan_09 {

    static List<String> list = new ArrayList<>();
    static String a[] = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String s = "23";
        System.out.println(letterCombinations(s));
    }

    private static List<String> letterCombinations(String s) {
        if(s.isEmpty()) return list;

        String temp = a[s.charAt(0)-'1'];
        for(int i = 0; i<temp.length(); i++){
            list.add(temp.charAt(i)+"");
        }

        for(int i = 1; i<s.length(); i++){
            String get = a[s.charAt(i)-'1'];
            addList(get);
        }
        return list;
    }

    private static void addList(String s){
        List<String> temp = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            String get = list.get(i);

            for(int j = 0; j<s.length(); j++){
                temp.add(get+s.charAt(j));
            }
        }
        list = new ArrayList<>(temp);
    }
}
