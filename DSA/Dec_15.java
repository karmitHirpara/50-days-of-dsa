package DSA;

// LeetCode 1. Two Sum
// ````````````````````

public class Dec_15 {

    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int t = 9;
        int[] res = twoSum(a,t);
        System.out.println("["+res[0]+","+res[1]+"]");
    }
    
    private static int[] twoSum(int[] a, int t) {
        int f = -1;
        int s = -1;
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int i = 0;i<a.length;i++){
            int diff = t-a[i];
            if(map.containsKey(diff)){
                f = i;
                s = map.get(diff);
                break;
            }
            map.put(a[i],i);//duplicate --> check first after add            
        }
        return new int[]{f,s}; 
    }
}