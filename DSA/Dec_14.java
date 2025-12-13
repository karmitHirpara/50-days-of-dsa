package DSA;

// LeetCode 3606. Coupon Code Validator
// `````````````````````````````````````

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Dec_14 {
    public static void main(String[] args) {
        String[] couponCodes = {"SAVE10", "GROCERY5", "PHARMA20", "ELECTRO15", "RESTAURANT25", "INVALID#CODE"};
        String[] categories = {"electronics", "grocery", "pharmacy", "electronics", "restaurant", "grocery"};
        boolean[] isValid = {true, true, false, true, true, true};

        List<String> validCoupons = validateCoupons(couponCodes, categories, isValid);
        System.out.println(validCoupons);
    }
    
    private static List<String> validateCoupons(String[] a, String[] b, boolean[] c) {
        TreeMap<String, List<String>> map = new TreeMap<>();
        for (int i = 0; i < a.length; i++) {
            if (c[i] && !a[i].isEmpty() && check(b[i]) && a[i].matches("[A-Za-z0-9_]+")) {
                List<String> ll = new ArrayList<>();
                if (!map.containsKey(b[i])) {
                    ll.add(a[i]);
                    map.put(b[i], ll);
                } else {
                    ll = map.get(b[i]);
                    ll.add(a[i]);
                    map.put(b[i], ll);
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (String x : map.keySet()) {
            Collections.sort(map.get(x));
            list.addAll(map.get(x));
        }
        return list;
    }

    private static boolean check(String s) {
            return s.equals("electronics")
            || s.equals("grocery")
            || s.equals("pharmacy")
            || s.equals("restaurant");
    }   
}
