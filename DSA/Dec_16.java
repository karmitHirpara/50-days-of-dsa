package DSA;

// LeetCode 1971. Find if Path Exists in Graph
// ````````````````````````````````````````````

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Dec_16 {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;
        System.out.println(validPath(n, edges, source, destination));

    }

    private static boolean validPath(int n, int[][] a, int s, int d) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int []x : a){
            addPath(graph, x[0], x[1]);
        }
        
        boolean check[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(s);
        check[s] = true;
        while(!q.isEmpty()){
            int remove = q.remove();

            if(remove == d) return true;

            for(int neb : graph.get(remove)){
                if(!check[neb]){
                    check[neb] = true;
                    q.add(neb);
                }
            }
        }
        return false;
    }

    private static void addPath(ArrayList<ArrayList<Integer>> list, int s, int d){
        list.get(s).add(d);
        list.get(d).add(s);
    }
}
