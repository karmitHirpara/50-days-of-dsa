package DSA;

// LeetCode 3741. Minimum Distance Between Three Equal Elements II
// ````````````````````````````````````````````````````````````````

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Apr_11 {
    public static void main(String[] args) {
        int a[] = {1,2,1,1,3};
        System.out.println(minimumDistance_1(a));
    }

    // Solution 1
    private static int minimumDistance_1(int[] a) {
        int n = a.length;
        int ans = Integer.MAX_VALUE;
        int prv[] = new int[n+1];
        int cur[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            prv[i] = cur[i] = -1;
        }
        
        //next
        for(int i=0;i<n;i++){
            int x = a[i];
            if(prv[x] != -1){
                ans = Math.min(ans, (i-cur[x]) + (cur[x]-prv[x]) + Math.abs(prv[x] - i));
            }
            prv[x] = cur[x];
            cur[x] = i;
        }
        return (ans==Integer.MAX_VALUE)? -1: ans;
    }

    // Solution 2
    private static int minimumDistance_2(int[] a) {
        HashMap<Integer, List<Integer>> map = new HashMap<>(a.length);
        
        for(int i = 0; i<a.length; i++){
            List<Integer> list = new ArrayList<>();
            if(!map.containsKey(a[i])){
                list.add(i);
            } else {
                list = map.get(a[i]);
                list.add(i);
            }
            map.put(a[i], list);
        }

        int ans = 99999999;
        
        for(int x : map.keySet()){
            List<Integer> list = map.get(x);
            if(list.size()>=3){
                int getMin = findMin(list);
                ans = Math.min(ans, getMin);
            }
        }
        
        return ans == 99999999 ? -1 : ans;
    }

    private static int findMin(List<Integer> list){
        int prv = list.get(0), cur = list.get(1), min = Integer.MAX_VALUE;
        for(int i = 2; i<list.size(); i++){
            min = Math.min(min, 
                Math.abs(prv-cur) + Math.abs(cur-list.get(i)) + Math.abs(list.get(i)-prv)
            );

            prv = cur;
            cur = list.get(i);
        }
        
        return min;
    }
}