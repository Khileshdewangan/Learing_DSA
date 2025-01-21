import java.util.ArrayList;

public class K_173_SourcetoTarget {
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

        graph[0].add(new Edge(0, 3));
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

    public static void printAllPath(ArrayList<Edge> [] graph, int source, int destination, String path){
        if(source == destination){
            System.out.println(path+destination);
            return;
        }

        for(int i=0; i<graph[source].size(); i++){
            Edge e = graph[source].get(i);
            printAllPath(graph, e.dest, destination, path+source);
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> [] graph = new ArrayList[v];
        creategraph(graph);
        printAllPath(graph, 5, 1, "");
    }
}
