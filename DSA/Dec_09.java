package DSA;

// LeetCode 1925. Count Square Sum Triples
// ----------------------------------------

public class Dec_09 {
    public int countTriples(int n) {
        int count = 0;
      
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                int m = (int) Math.sqrt((i * i) + (j * j));
                if(m*m == (i*i + j*j) && m <= n) {
                    count++;
                }
            }
        }
        return count * 2;
    }
}
