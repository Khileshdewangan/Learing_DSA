import java.util.ArrayList;

public class K_165_hasPath {
    static class Edge {
        int sour;
        int dist;
        int wet;

        public Edge(int s, int d, int w) {
            this.sour = s;
            this.dist = d;
            this.wet = w;
        }
    }

    public static void creategraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
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

    public static boolean hasPath(ArrayList<Edge> [] graph, int s, int d, boolean [] visited){
        if(s == d){
            return true;
        }
        visited[s] = true;

        for(int i=0; i<graph[s].size(); i++){
            Edge e = graph[s].get(i);
            if(!visited[e.dist] && hasPath(graph, e.dist, d, visited)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        boolean h = hasPath(graph, 2,5, new boolean[v]);
        System.out.println(h);
    }
}
