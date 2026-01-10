package DSA;

// LeetCode 46. Permutations
// ``````````````````````````

import java.util.ArrayList;
import java.util.List;

public class Jan_10 {

    static List<List<Integer>> list;

    public static void main(String[] args) {
        int a[] = {1,2,3};
        System.out.println("Hello, World!");
    }

    public static List<List<Integer>> permute(int[] a) {
        list = new ArrayList<>();
        code(a, 0);
        return list;
    }

    private static void code(int []a, int ind){
        if(ind == a.length){
            List<Integer> temp = new ArrayList<>(a.length);
            for(int x : a){
                temp.add(x);
            }
            list.add(temp);
            return;
        }

        for(int i = ind; i<a.length; i++){
            swap(a, i, ind);
            code(a, ind+1);
            swap(a, i, ind);
        }
    }

    private static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}