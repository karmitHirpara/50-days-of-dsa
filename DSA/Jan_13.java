package DSA;

// Leetcode 13. Roman to Integer
// ``````````````````````````````

public class Jan_13 {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    private static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if((i+1)<s.length() && roman(s.charAt(i))<roman(s.charAt(i+1))){
                sum-=roman(s.charAt(i));
            }else sum+=roman(s.charAt(i));
        }
        return(sum);
    }
     private static int roman(char x){
        switch (x){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
    
}
