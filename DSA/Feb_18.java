package DSA;

import java.util.HashMap;

// LeetCode 3843. First Unique Frequency
// ``````````````````````````````````````

public class Feb_18 {

    public static void main(String[] args) {
        int []a = {20,20,10,30,30,30};
        System.out.println(firstUniqueFreq(a));
    }   

    public static int firstUniqueFreq(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : a){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int x : map.values()){
            map1.put(x, map1.getOrDefault(x, 0)+1);
        }

        for(int x : a){
            int get = map.get(x);
            if(map1.get(get) == 1){
                return x;
            }
        }
        return -1;
    }

}

