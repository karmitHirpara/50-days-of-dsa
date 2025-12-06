package DSA;

// LeetCode 3300. Minimum Element After Replacement With Digit Sum
// `````````````````````````````````````````````````````````````````````````````````````````

public class Dec_06 {

    public static void main(String[] args) {
        int [] a = {10,12,13,14};
        int res = minElement(a);
        System.out.println(res);
    }

    public static int minElement(int[] a) {
        int min = 1000000000;
        for(int x : a) min = Math.min(getSum(x), min);
        return min;
    }
    
    private static int getSum(int n){
        int sum = 0;
        while(n!=0){
            int m = n%10;
            sum+=m;
            n/=10;
        }
        return sum;
    }

}

