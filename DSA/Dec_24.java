package DSA;

// Leetcode 504. Base 7
// `````````````````````

public class Dec_24 {
    public static void main(String[] args) {
        int n = -7;   
        System.out.println(convertToBase7(n));
    }

    public static String convertToBase7(int n) {
        if(n == 0) return "0";

        int fix = n;
        n *= (n>0) ? 1 : -1;
        String s = "";
        while(n>0){
            int m = n%7;
            s = m + s;
            n/=7;
        }
        return (fix>0) ? s : "-"+s;
    }
    
}
