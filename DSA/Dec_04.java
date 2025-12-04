package DSA;

// LeetCode 976. Largest Perimeter Triangle
// `````````````````````````````````````````````````````````````````````````````````````````

public class Dec_04 {
    public static void main(String[] args) {
        int arr[] = {2,1,2};
        int res = largestPerimeter(arr);
        System.out.println(res);
    }
 
    public static int largestPerimeter(int[] a) {
        quickSort(a, 0, a.length-1);
        int e = a.length-1;
        
        while(e >= 2){
            int x = a[e], y = a[e-1], z = a[e-2];

            if(x+y>z && y+z>x && x+z>y){
                return x+y+z;
            }else {
                e--;
            }

        }
        return 0;
    }

    private static void quickSort(int a[], int l, int r){
        if(l>=r) return;

        int s = l, e = r;
        int mid = l + (r-l)/2;
        int pivot = a[mid];

        while(s<=e){
            while(a[s]<pivot){
                s++;
            }
            while(a[e]>pivot){
                e--;
            }
            if(s <= e){
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(a, l, e);
        quickSort(a, s, r);
    }
}
