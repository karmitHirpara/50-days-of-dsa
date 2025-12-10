package DSA;

// LeetCode 1314. Matrix Block Sum
// ````````````````````````````````

public class Dec_10 {
    public static void main(String[] args) {
        int a[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int k = 1;
        int res[][] = matrixBlockSum(a, k);
        for(int i = 0; i<res.length; i++){
            for(int j = 0; j<res[0].length; j++){
                System.out.print(res[i][j] + " ");          
            }   
            System.out.println();
        }
    }

    public static int[][] matrixBlockSum(int[][] a, int k) {
        int ans[][] = new int[a.length][a[0].length];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                ans[i][j] = sum(a, i, j, k);
            }
        }   
        return ans;    
    }

    private static int sum(int a[][], int row, int col, int k){
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                if(row-k <= i && i<=row+k  && col-k<=j && j<=col+k) sum+=a[i][j];
            }
        }
        return sum;
    }
}
