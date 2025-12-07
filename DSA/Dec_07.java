package DSA;

// LeetCode 1523. Count Odd Numbers in an Interval Range
// ------------------------------------------------------

public class Dec_07 {

    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        System.out.println(countOdds_2(low, high));
    }

    // 1st approach
    private static int countOdds_1(int low, int high) {
        int c = 0;

        if (low % 2 == 0) {
            low++;
        }

        while (low <= high) {
            if (low % 2 != 0) c++;
            low += 2;
        }

        return c;
    }

    // 2nd approach
    private static int countOdds_2(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        }
        return (high - low) / 2 + 1;
    }
}
