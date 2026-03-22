package DSA;

// Leetcode 1886. Determine Whether Matrix Can Be Obtained By Rotation
// ````````````````````````````````````````````````````````````````````

public class Mar_22 {
    public static void main(String[] args) {
        int a[][] = {{0,1},{1,0}};
        int b[][] = {{1,0},{0,1}};
        System.out.println(findRotation(a, b)); 
    }

    public static boolean findRotation(int[][] a, int[][] b) {
        boolean f= true,s = true, t = true, f1 = true;
        for(int i = 0 ; i<a.length; i++){
            for(int j = 0 ; j<a.length; j++){
                if(b[i][j] != a[a.length-j-1][i])f = false; //
                if(b[i][j] != a[a.length-i-1][a.length-j-1])s = false;
                if(b[i][j] != a[j][a.length-i-1])t = false;
                if(b[i][j] != a[i][j])f1 = false;
            }  
        }
        return f||s||t||f1; 
    }
}
