package DSA;

// LeetCode 598. Range Addition II
// --------------------------------

public class Dec_08 {

    public static void main(String[] args) {
        int m = 3, n = 3;
        int a[][] = { { 0, 0 }, { 1, 1 }, { 2, 2 } };
        int res = maxCountApproach1(m, n, a);
        System.out.println(res);
    }

    // Approach 2 (Optimized)
    private static int maxCountApproach2(int m, int n, int[][] ops) {
        int minRow = m, minCol = n;

        for (int[] op : ops) {
            if (minRow > op[0]) minRow = op[0];
            if (minCol > op[1]) minCol = op[1];
        }

        return minRow * minCol;
    }

    // Approach 1 (Brute / Simulation)
    private static int maxCountApproach1(int m, int n, int[][] ops) {
        int rowMax = 0, colMax = 0;
        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] op : ops) {
            rowMax = incrementRowOrCol(row, op[0]);
            colMax = incrementRowOrCol(col, op[1]);
        }

        int rowMaxIndex = getMaxFrequencyIndex(row, rowMax);
        int colMaxIndex = getMaxFrequencyIndex(col, colMax);

        return rowMaxIndex * colMaxIndex;
    }

    private static int getMaxFrequencyIndex(int[] arr, int targetVal) {
        int i = 0;
        while (i < arr.length && arr[i] == targetVal) {
            i++;
        }
        return i;
    }

    private static int incrementRowOrCol(int[] arr, int limit) {
        int max = 0;
        for (int i = 0; i < limit; i++) {
            max = Math.max(max, ++arr[i]);
        }
        return max;
    }
}
