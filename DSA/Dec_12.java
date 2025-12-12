package DSA;

// LeetCode 2048. Next Beautiful Number
// `````````````````````````````````````

public class Dec_12 {
    public static void main(String[] args) {
        int n = 1000;
        int ans = nextBeautifulNumber(n);
        System.out.println(ans);
    }

    private static int nextBeautifulNumber(int n){
        int a[];
        boolean check;

        do {
            a = countDigits(++n);
            check = isKeyAndValueIsEqual(a, n);
        } while (!check);

        return n;
    }

    private static boolean isKeyAndValueIsEqual(int a[], int n) {
        while (n != 0) {
            int m = n % 10;
            if (a[m] != m)
                return false;
            n /= 10;
        }
        return true;
    }

    private static int[] countDigits(int n) {
        int a[] = new int[10];
        while (n != 0) {
            int m = n % 10;
            a[m]++;
            n /= 10;
        }
        return a;
    }
}
