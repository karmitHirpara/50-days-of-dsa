package DSA;

// LeetCode 1018: Binary Prefix Divisible By 5
// `````````````````````````````````````````````````````````````````````````````````````````

import java.util.ArrayList;
import java.util.List;

class Nov_24 {

    public static void main(String[] args) {
        int[] a = {0,1,1};
        List<Boolean> res = prefixesDivBy5(a) ;
        System.out.println(res);
    }

    private static List<Boolean> prefixesDivBy5(int[] a) {
        List<Boolean> list = new ArrayList<>(a.length);
        int mod = 0;
        for (int bit : a) {
            mod = (mod*2 + bit)%5;
            list.add(mod%5==0 ? true : false);
        }
        return list;
    }
}

