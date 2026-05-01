package DSA;

// LeetCode 3909. Compare Sums of Bitonic Parts
// `````````````````````````````````````````````

public class May_01 {

    public static void main(String[] args) {
        int a[] = {1,3,2,1};
        System.out.println(compareBitonicSums(a));
    }

    public static int compareBitonicSums(int[] a) {
        int i = 0;
        long suml = a[i];
        while(i<a.length && a[i]<a[i+1]){
            suml += a[++i];
        }
        i = a.length-1;
        long sumr = a[i];
        while(i>=0 && a[i-1]>a[i]){
            sumr += a[--i];
        }
        
        if(suml == sumr) return -1;
        return suml>sumr ? 0 : 1;
    }
}
