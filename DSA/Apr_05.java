package DSA;

// LeetCode 3693. Stable Mountains
// ````````````````````````````````

import java.util.ArrayList;
import java.util.List;

public class Apr_05 {
    public static void main(String[] args) {
        int height[] = {1,2,3,4,5};
        int threshold = 3;
        System.out.println(stableMountains(height, threshold));
    }

    private static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> list = new ArrayList<>(height.length);

        for(int i = 1; i<height.length; i++){
            if(height[i-1]>threshold){
                list.add(i);
            }
        }

        return list;

    }
}
