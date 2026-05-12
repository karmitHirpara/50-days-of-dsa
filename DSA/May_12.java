package DSA;

// LeetCode 3908. Valid Digit Number
// ``````````````````````````````````

public class May_12 {

    public static void main(String[] args) {
        int n = 123;
        int x = 1;
        System.out.println(validDigit(n, x));
    }

    public static int validDigit(int n, int x) {
        String s = n+"";
        char ch = (char)(x+'0');

        return (s.indexOf(ch) != -1 && s.charAt(0) != ch) ? 1 : 0;
    }

    
}
