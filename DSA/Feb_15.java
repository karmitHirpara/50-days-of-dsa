package DSA;

import java.util.ArrayList;
import java.util.List;

// LeetCode 3842. Toggle Light Bulbs
// ``````````````````````````````````

public class Feb_15 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 30, 20, 10));
        Feb_15 obj = new Feb_15();
        System.out.println(obj.toggleLightBulbs(list));
    }

    public List<Integer> toggleLightBulbs(List<Integer> list) {
        boolean []a = new boolean[100];

        for(int x : list){
            a[x-1] = !a[x-1];
        }

        list = new ArrayList<>();
        for(int i = 0; i<a.length; i++){
            if(a[i]){
                list.add(i+1);
            }
        }

        return list;

    }
    
}
