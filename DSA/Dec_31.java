package DSA;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Leetcode Problem 1387: Sort Integers by The Power Value
// ````````````````````````````````````````````````````````

public class Dec_31 {

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int lo = 12, hi = 15, k = 2;
        System.out.println(getKth(lo, hi, k));
    }

    public static int getKth(int lo, int hi, int k) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int fix = lo;
        while(lo<=hi){
            int get = code(lo);
            map1.put(lo++, get);
        }
        
        map1 = map1.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.print(map1);
        int c = k, ans = -1;
        for(int x : map1.keySet()){
            if(c-- == 0) break;
            ans = x;
        }
        return ans;
    }

    private static int code(int x){
        if (x == 1) {
            return 0;
        } else if (x == 0) {
            return 0;
        }

        if (map.containsKey(x)) return map.get(x);

        int get = x % 2 == 0 ? code(x / 2) + 1 : code((x * 3) + 1) + 1;
        map.put(x, get);

        return map.get(x);
    }
}