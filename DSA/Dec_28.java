package DSA;

// LeetCode 1351. Count Negative Numbers in a Sorted Matrix
// `````````````````````````````````````````````````````````

public class Dec_28 {
    public static void main(String[] args) {
        int[][] a = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int result = countNegatives_approach_1(a);
        System.out.println(result);
    }
    

    private int countNegatives_approach_1(int[][] a) {
        int c = 0 ;
        for(int []x : a){
            Arrays.sort(x);
        }
        for(int []x : a){
            int l = 0, r = x.length-1;
            while (l<=r){
                int mid = (l+r)/2;
                if(x[mid]<0){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
            c+=l;
        }
        return c;
    }

    public static int countNegatives_approach_2(int[][] a) {
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
