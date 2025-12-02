package DSA;

// LeetCode 3745. Maximize Expression of Three Elements
// `````````````````````````````````````````````````````````````````````````````````````````

class Dec_02 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int res = maximizeExpressionOfThree(arr);
        System.out.println(res);
    }

    private static int maximizeExpressionOfThree(int[] a) {
        int f1 = Integer.MIN_VALUE, f2 = f1, min = a[0];        
        for(int x : a){
            if(f1<=x){
                f2 = f1;
                f1 = x;
            }else if(f2<x) f2 = x;
            
            if(min>x) min = x;
        }
        return f1+f2-min;
    }
}