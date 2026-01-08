package DSA;

// LeetCode 3798. Largest Even Number
// ```````````````````````````````````

public class Jan_08 {
    public static void main(String[] args) {
        String s = "1112";
        System.out.println(largestEven(s));
    }

    private static String largestEven(String s) {
        int i = s.length()-1;

        while(i != -1){
            int num = s.charAt(i)-'0';
            if(num%2==0){
                return s.substring(0, i+1);
            }
            i--;
        }
        return "";
    }
}
