package DSA;

// LeetCode 2799. Count Complete Subarrays in an Array
// `````````````````````````````````````````````````````````````````````````````````````````

import java.util.HashSet;

public class Dec_03 {
    public static void main(String[] args) {
        int arr[] = {1,3,1,2,2};
        int res = countCompleteSubarrays(arr);
        System.out.println(res);
    }

    private static int countCompleteSubarrays(int[] a) {
        HashSet<Integer> set = new HashSet<>(a.length);
        for(int x : a){
            set.add(x);
        }
        int size = set.size(), c = 0;
        for(int i = 0; i<a.length; i++){
            set = new HashSet<>();
            for(int j = i; j<a.length; j++){
                set.add(a[j]);
                if(set.size() == size) c++;
            }
        }
        return c;
    }
}
