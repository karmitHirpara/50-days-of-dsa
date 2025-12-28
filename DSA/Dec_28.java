package DSA;

// LeetCode 1351. Count Negative Numbers in a Sorted Matrix
// `````````````````````````````````````````````````````````

public class Dec_28 {
    public static void main(String[] args) {
        int[][] a = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int result = countNegatives(a);
        System.out.println(result);
    }
    
    public static int countNegatives(int[][] a) {
        int c = 0 ;
        for(int i = 0 ; i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                if(a[i][j]<0){
                    c++;
                }
            }
        }
        return c;
    }
}
