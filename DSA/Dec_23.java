package DSA;

// 3783. Mirror Distance of an Integer
// ````````````````````````````````````

public class Dec_23 {
    public static void main(String[] args) {
        System.out.println(mirrorDistance(25));
    }

    private static int mirrorDistance(int n) {
        return abs(reverse(n)-n);
    }

    private static int reverse(int n){
        int fix = 0;
        while(n != 0){
            int m = n%10;
            fix = (fix*10) + m;
            n/=10;
        }
        return fix;
    }

    private static int abs(int n){
        return (n>0) ? n : n*-1;  
    } 
    
}
