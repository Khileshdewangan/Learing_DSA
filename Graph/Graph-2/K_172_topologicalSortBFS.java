import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class K_172_topologicalSortBFS {
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

    public static void calcIndegree(ArrayList<Edge> [] graph, int indegree[]){

        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                indegree[e.dest]++;
            }
        }
    }
    public static void topologicalSortBFS(ArrayList<Edge> [] graph) {
        int [] indegree = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        calcIndegree(graph, indegree);

        for(int i=0; i<graph.length;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        //BFS
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indegree[e.dest]--;

                if(indegree[e.dest] == 0){
                    q.add(e.dest);
                }

            }
        }


    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> [] graph = new ArrayList[v];
        creategraph(graph);
        topologicalSortBFS(graph);
    }
}
