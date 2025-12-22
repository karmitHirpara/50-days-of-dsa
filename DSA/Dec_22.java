package DSA;

// LeetCode 1773. Count Items Matching a Rule
// ```````````````````````````````````````````

import java.util.List;

public class Dec_22 {
    public static void main(String[] args) {
        List<List<String>> items = List.of(
            List.of("phone","blue","pixel"),
            List.of("computer","silver","lenovo"),
            List.of("phone","gold","iphone")
        );
        String key = "color", value = "silver";
        System.out.println(countMatches(items, key, value)); 
    }   

    public static int countMatches(List<List<String>> list, String key, String value) {
        int c = 0;
        int j = 0;
        if(key.equals("color")) j = 1;
        else if(key.equals("name")) j = 2;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).get(j).equals(value)) c++;
        }
        return c;
    }
}
