package DSA;

// Leetcode 1338. Reduce Array Size to The Half
// `````````````````````````````````````````````

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Jan_05 {
    public static void main(String[] args) {
        int a[] = {3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(a));
    }   

    private static int minSetSize(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : a){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        map = map.entrySet().stream()
                        .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                                .collect(Collectors.toMap(Map.Entry::getKey,
                                        Map.Entry::getValue, (e1,e2)->e2,LinkedHashMap::new));
        int n = a.length/2;
        int c = 0;
        for(int x : map.values()){
           int dif = n-x;
            if(dif>0){
                n = dif;
                c++;
            }else {
                c++;
                break;
            }
        }
        return c;
    }
}