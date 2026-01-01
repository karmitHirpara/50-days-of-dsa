package DSA;

import java.lang.reflect.Array;

// LeetCode 1356. Sort Integers by The Number of 1 Bits
// `````````````````````````````````````````````````````

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jan_01 {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8};
        int[] res = sortByReflection(a);
        System.out.println(Arrays.toString(res));
    }


    private static int[] sortByReflection(int[] a) {
            StringBuilder sb;
            List<code> list = new ArrayList<>() ;
            code code = null;
            for(int x : a){
                sb = new StringBuilder(Integer.toBinaryString(x));
                sb.reverse();
                int rev = Integer.parseInt(sb.toString(), 2);

                code = new code(x, rev);
                list.add(code);
            }
            Collections.sort(list, code);
            int i = 0;
            for (code x : list) {
                System.out.println(x.x + "->" + x.rev);
                a[i++] = x.x;
            }
            return a;
        }
}

class code implements Comparator<code> {
    int x, rev;

    public code(int x, int rev) {
        this.x = x;
        this.rev = rev;
    }

    @Override
    public int compare(code o1, code o2) {
        if (o1.rev > o2.rev) return 1;
        else if (o1.rev < o2.rev) return -1;
        else {
            if (o1.x > o2.x) return 1;
            else return -1;
        }
    }
}
