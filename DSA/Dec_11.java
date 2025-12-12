package DSA;

import java.util.HashMap;

// LeetCode 3484. Design Spreadsheet
// ``````````````````````````````````

public class Dec_11 {
    public static void main(String[] args) {
        Spreadsheet spreadsheet = new Spreadsheet(3); 
        int val = spreadsheet.getValue("=5+7"); 
        System.out.println(val);
        spreadsheet.setCell("A1", 10);      
        val = spreadsheet.getValue("=A1+6"); 
        System.out.println(val);
        spreadsheet.setCell("B2", 15);      
        val = spreadsheet.getValue("=A1+A2");
        System.out.println(val);
        spreadsheet.resetCell("A1");       
        val = spreadsheet.getValue("A1+B2");
        System.out.println(val);
    }   
}

class Spreadsheet {

    HashMap<String, Integer> map;
    public Spreadsheet(int rows) {
        map = new HashMap<>(rows);
    }
    
    public void setCell(String key, int val) {
        map.put(key, val);
    }
    
    public void resetCell(String key) {
        map.put(key, 0);
    }
    
    public int getValue(String s) {
        s = s.substring(1);
        String a[] = s.split("\\+");

        int x = 0, y = 0;

        if(check(a[0])){
            if(map.containsKey(a[0]))
            x = map.get(a[0]);
        }else {
            x = Integer.parseInt(a[0]); 
        }
        if(check(a[1])){
            if(map.containsKey(a[1]))
            y = map.get(a[1]);
        } else {
            y = Integer.parseInt(a[1]); 
        }

        return x+y;
    }

    

    private boolean check(String s){
        for(int i = 0; i<s.length(); i++){
            if(isChar(s.charAt(i))) return true;
        }
        return false;
    }

    private boolean isChar(char ch){
        return ch>='A' && ch<='Z';
    }    
}
