package DSA;

// LeetCode 2352. Equal Row and Column Pairs
// ``````````````````````````````````````````

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dec_21 {
    public static void main(String[] args) {
        int [][]a = {
            {3,2,1},
            {1,7,6},
            {2,7,7}
        };
        System.out.println(equalPairs(a));
    }

    public static int equalPairs(int[][] a) {
        int c = 0;
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for(int i = 0; i<a.length; i++){
            List<Integer> list = add(a[i]);
            if(!map.containsKey(list)){
                map.put(list, 1);
            }else {
                int get = map.get(list);
                map.put(list, get+1);
            }
        }
        for(int i = 0; i<a.length; i++){
            List<Integer> list = add1(i, a);
            if(map.containsKey(list)){
                int get = map.get(list);
                c+=get;
            }
        }
        return c;
    }

    private static List<Integer> add(int[] a) {
        List<Integer> list = new ArrayList<>();
        for(int x : a){
            list.add(x);
        }
        return list;
    }

     private static List<Integer> add1(int j, int [][]a) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<a.length; i++){
            list.add(a[i][j]);
        }
        System.out.print(list);
        return list;
    }
}
