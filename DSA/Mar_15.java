package DSA;

// Leetcode 3870. Count Commas in Range
// `````````````````````````````````````

class Mar_15 {
    public static void main(String[] args) {
        int n = 999;
        System.out.println(countCommas_1(n));
    }

    private  static int countCommas_1(int n) {
        int c = 0;
        while(n > 999){
            if(n-100>999){
                c+=100;
                n-=100;
            } else{
                c+=get(n--);
            }
        }
        return c;
    }

    private static int get(int n){
        if(n<1000) return 0;
        return 1;
    }

    private static int countCommas_2(int n) {
        return (n<1000) ? 0 : n-999;
    }
}