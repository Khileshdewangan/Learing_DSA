import java.util.ArrayList;

public class K_170_cycleDEtetion {
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

        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 4));

        // graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 1));
        // graph[5].add(new Edge(5, 6));

        // graph[6].add(new Edge(6, 5));

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));
    }

    public static boolean isCycle(ArrayList<Edge> [] graph){
        boolean [] visited = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(isCycleUtill(graph, i, visited, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtill(ArrayList<Edge> [] graph, int curr, boolean[] visited, boolean[] stack){
        visited[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true; //cycle exist
            }
            else if(!visited[e.dest] && isCycleUtill(graph, e.dest, visited, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        // int v = 7;
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(isCycle(graph));
    }
}
