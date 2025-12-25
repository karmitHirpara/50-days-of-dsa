package DSA;

// Leetcode 394. Decode String
// ````````````````````````````

import java.util.Stack;
import java.util.stream.Collectors;

public class Dec_25 {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }   
    
    public static String decodeString(String s) {
        Stack<String> stk = new Stack<>();
        Stack<Integer> digit = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isDigit(ch)) {
                if (!digit.isEmpty() && i - 1 > -1 && isDigit(s.charAt(i - 1))) {
                    digit.add(digit.pop() * 10 + (ch - '0'));
                } else digit.push(ch - '0');
            } else if (ch == ']') {
                String add = "";
                while (!stk.isEmpty() && !stk.peek().equals("[")) {
                    add = stk.pop() + add;
                }
                if (stk.peek().equals("[")) stk.pop();

                int num = digit.pop();
                add = add.repeat(num);
                stk.push(add);
            } else {
                stk.push(ch + "");
            }
        }
        return stk.stream().collect(Collectors.joining(""));
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}
