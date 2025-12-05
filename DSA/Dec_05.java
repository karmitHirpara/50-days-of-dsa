package DSA;

// LeetCode 3438. Find Valid Pair of Adjacent Digits in String
// `````````````````````````````````````````````````````````````````````````````````````````

public class Dec_05 {
    public static void main(String[] args) {
        String s = "2523533";
        String res = findValidPair(s);
        System.out.println(res);
    }

    private static String findValidPair(String s) {
        int []a = new int[10];
        for(int i = 0; i<s.length(); i++){
            int ascii = s.charAt(i) - '0';
            a[ascii]++;
        }
        for(int i = 0; i<s.length()-1; i++){
            int a1 = s.charAt(i) - '0', a2 = s.charAt(i+1) - '0';

            if(a1 != a2 && a[a1] == a1 && a[a2] == a2){
                return a1+""+a2;
            }
        }
        return "";
    }
}
