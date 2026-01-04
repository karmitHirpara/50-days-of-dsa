package DSA;

// LeetCode 1390. Four Divisors
// `````````````````````````````

public class Jan_04{
    public static void main(String[] args) {
        int[] a = {21,4,7};
        System.out.println(sumFourDivisors(a));
    }

    public static int sumFourDivisors(int[] a) {
        int c = 0;

        for(int x : a){
            int temp = 0, sum = 0;
            
            for(int i = 1; i*i<=x && temp<5; i++){
                if(x%i==0){
                    sum+=i;
                    temp++;

                    if(i*i!=x){
                        temp++;
                        sum+=x/i;
                    }
                }
            }
            if(temp == 4) c+=sum;
        }
        return c;
    }
}