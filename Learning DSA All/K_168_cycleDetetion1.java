import java.util.ArrayList;

//cycle detetion in underetion graph
public class K_168_cycleDetetion1 {

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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 1));
        // graph[5].add(new Edge(5, 6));

        // graph[6].add(new Edge(6, 5));
    }

    public static boolean cycleDetetion1(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if( cycleDetetionUtill(graph, visited, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cycleDetetionUtill(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case-3
            if (!visited[e.dest]) {
                if (cycleDetetionUtill(graph, visited, e.dest, curr)) {
                    return true;
                }
                //case-2
            } else if (visited[e.dest] && e.dest != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        // int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(cycleDetetion1(graph));
    }
}