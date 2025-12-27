package DSA;

// LeetCode 2679. Matrix Block Reverse
// ````````````````````````````````````

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dec_27 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = reverseSubmatrix(matrix, 0, 0, 2);
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] reverseSubmatrix(int[][] a, int x, int y, int k) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        if(k == 1) return a;
        for (int i = x; i < a.length && map.size() < k; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = y; j < a[i].length && list.size() < k; j++) {
                list.add(a[i][j]);
            }
            if (map.size() < k) map.put(i, list);
        }
        int rev = x + k - 1;
        for (int i = x; i < a.length; i++) {
            List<Integer> list = map.get(rev--);
            if (list == null) break;
            int temp = 0;
            for (int j = y; j < a[i].length && j < y + list.size(); j++) {
                a[i][j] = list.get(temp++);
            }
        }
        return a;
    }
    
}
