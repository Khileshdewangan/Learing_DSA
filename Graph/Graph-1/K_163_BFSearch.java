import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class K_163_BFSearch {
    static class Edge{
        int sour;
        int dist;
        int wet;
        public Edge(int s, int d, int w){
            this.sour = s;
            this.dist = d;
            this.wet = w;
        }
    }
    
    public static void creategraph(ArrayList<Edge> [] graph){
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
    
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
    
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
    
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
    
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
    
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
    
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
    
        graph[6].add(new Edge(6, 5, 1));
    
    }
    
    public static void bfsSearch(ArrayList<Edge> [] graph){
        Queue<Integer> q = new LinkedList<Integer>();
        boolean [] visited = new boolean[graph.length];
    
        q.add(2); //source
        
        while (!q.isEmpty()) {
            int curr = q.remove();
            if(!visited[curr]){
                visited[curr] = true;
                System.out.println(curr + " ");
                for(int i =0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dist);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        bfsSearch(graph);
    }
}



/*
 
public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0; i<v; i++){
            // graph.add(new ArrayList<Integer>());
            ArrayList<Integer> temp = new ArrayList<>();
            graph.add(temp);
        }

        ArrayList<Integer> temp = graph.get(1);
        temp.add(2);

        graph.get(2).add(1);
        graph.get(1).add(3);
        graph.get(3).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(3);


        //print 
        /*
        for(int i=0; i< graph.size(); i++){
            System.out.print(i + " -->");
            for(int j =0; j<graph.get(i).size(); j++){
                System.out.print(graph.get(i).get(j) + "-->");
            }

            System.out.println();
        }
        

        //BFS

        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[graph.size()];
        

        visited[1] = true;
        q.add(1);

        while (!q.isEmpty()){
            int curr = q.poll();
            System.out.println(curr + " ");
            for(int neibour : graph.get(curr)){
                if(!visited[neibour]){
                    visited[neibour] = true;
                    q.add(neibour);
                }
            }
        } 
    }
*/