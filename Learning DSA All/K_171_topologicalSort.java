import java.util.ArrayList;
import java.util.Stack;


//Using DFS

public class K_171_topologicalSort {
    static class Edge {
        int source;
        int dest;

        public Edge(int s, int d) {
            this.source = s;
            this.dest = d;
        }
    }

    public static void creategraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));
        // graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        // graph[5].add(new Edge(5, 6));

        // graph[6].add(new Edge(6, 5));
    }

    public static void topologicalSort(ArrayList<Edge>[] graph) {
        boolean[] visite = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!visite[i]){
                topologicalSortUtill(graph, i, visite, s);
            }
        }

        while(!s.empty()){
            System.out.print(s.pop() + " ");
        }
    }


    public static void topologicalSortUtill(ArrayList<Edge> [] graph, int curr, boolean[] visite, Stack<Integer> s ){
        visite[curr] =true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visite[e.dest]){
                topologicalSortUtill(graph, e.dest, visite, s); //modified DFS
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int v = 6;
        // int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        topologicalSort(graph);
    }
}
