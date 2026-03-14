package DSA;

import java.util.HashMap;

public class Mar_14 {
    
    static HashMap<Integer, String> map;

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(numberToWords(n));
    }

    public static String numberToWords(int num) {
        addInMap();
        if (num == 0) return "Zero";
        return wordToString(num).trim();
    }

    private static String wordToString(int n) {
        String ans = "";
        String temp = "";
        int group = 0;

        String[] units = {"", " Thousand", " Million", " Billion"};

        while (n != 0) {

            int m = n % 10;
            temp = m + temp;
            n /= 10;

            if (temp.length() == 3) {

                String part = convert(temp);

                if (!part.equals("")) {
                    ans = part + units[group] + ans;
                }

                temp = "";
                group++;
            }
        }

        if (!temp.isEmpty()) {
            String part = convert(temp);
            if (!part.equals("")) {
                ans = part + units[group] + ans;
            }
        }

        return ans;
    }

    private static String convert(String s) {
        String ans = "";

        while (s.length() < 3) {
            s = '0' + s;
        }

        if (s.equals("000")) return "";

        if (s.charAt(0) != '0') {
            ans += map.get(s.charAt(0) - '0');
            ans += map.get(100);
        }

        ans += TwoDigits(s.substring(1));

        return ans;
    }

    private static String TwoDigits(String s) {

        int num = Integer.parseInt(s);

        if (num == 0) return "";

        if (num < 20)
            return map.get(num);

        if (num % 10 == 0)
            return map.get(num);

        return map.get((num / 10) * 10) + map.get(num % 10);
    }

    private static void addInMap() {
        map = new HashMap<>();

        map.put(1, " One");
        map.put(2, " Two");
        map.put(3, " Three");
        map.put(4, " Four");
        map.put(5, " Five");
        map.put(6, " Six");
        map.put(7, " Seven");
        map.put(8, " Eight");
        map.put(9, " Nine");

        map.put(10, " Ten");
        map.put(11, " Eleven");
        map.put(12, " Twelve");
        map.put(13, " Thirteen");
        map.put(14, " Fourteen");
        map.put(15, " Fifteen");
        map.put(16, " Sixteen");
        map.put(17, " Seventeen");
        map.put(18, " Eighteen");
        map.put(19, " Nineteen");

        map.put(20, " Twenty");
        map.put(30, " Thirty");
        map.put(40, " Forty");
        map.put(50, " Fifty");
        map.put(60, " Sixty");
        map.put(70, " Seventy");
        map.put(80, " Eighty");
        map.put(90, " Ninety");

        map.put(100, " Hundred");
    }
}
