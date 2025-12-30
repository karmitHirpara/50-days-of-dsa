package DSA;

// LeetCode 840. Magic Squares In Grid
// ````````````````````````````````````

public class Dec_30 {
    public static void main(String[] args) {
        int[][] a = {
            {4,3,8,4},
            {9,5,1,9},
            {2,7,6,2}
        };
        int result = numMagicSquaresInside(a);
        System.out.println(result);

    }

    private static int numMagicSquaresInside(int[][] a) {
        int c = 0;
        int []temp = null;
        for(int i = 0; i<a.length-2; i++){
            for(int j = 0; j<a[i].length-2; j++){
                temp = new int[]{a[i][j], a[i][j+1], a[i][j+2], 
                        a[i+1][j], a[i+1][j+1], a[i+1][j+2],
                        a[i+2][j], a[i+2][j+1], a[i+2][j+2]
                        };
                if(     temp[3]+temp[6] == temp[1]+temp[2] 
                        && temp[4]+temp[7] == temp[0]+temp[2] 
                        && temp[8]+temp[5] == temp[1]+temp[0] 
                        && temp[0]+temp[6] == temp[4]+temp[5]
                        && temp[1]+temp[7] == temp[3]+temp[5]
                        && temp[2]+temp[8] == temp[3]+temp[4] 
                        && temp[0]+temp[3] == temp[7]+temp[8] 
                        && temp[4]+temp[1] == temp[6]+temp[8] 
                        && temp[6]+temp[7] == temp[2]+temp[5]
                        //diogonals
                        && temp[0]+temp[8] == temp[2]+temp[6]
                    )
                {
                    boolean k = true;
                    int []ascii = new int[9];
                    for(int x : temp){
                        if(x>9 || x == 0) break;
                        ascii[x-1]++;
                    }for(int x : ascii){
                        if(x != 1){
                            k = false;
                            break;
                        }
                    }
                    if(k) c++;
                }
            }
        }
        return c;   
    }
}