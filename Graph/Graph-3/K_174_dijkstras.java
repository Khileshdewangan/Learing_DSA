import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_174_dijkstras {
    static class Edge {
        int source;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void creategraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));


        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 5, 5));
      
    }

    static class pair implements Comparable<pair>{
        int n;
        int path;
        pair(int n, int path){
            this.n = n;
             this.path = path;
        }

        @Override
        public int compareTo(pair p2) {
            // path base sorting for my pairs
           return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] visited = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();

        pq.add(new pair(src, 0));

        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if(!visited[curr.n]){
                for(int i=0; i<graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.source;
                    int v= e.dest;
                    int wt = e.wt;
                    if(dist[u] + wt < dist[v]){
                        //update distance of source to v
                        dist[v] = dist[u]+wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }

        //print all sourse to nodes shortest path
        for(int i=0; i<dist.length; i++){
            System.out.println(src+ " to "+i+"th node distance is : "+dist[i] + " ");
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);
        dijkstra(graph,0);
    }
}


/*
graph reprasent
                            7
                       1-------->3
                    2^/|         ^\1
                     / |         | \
                    0  |1       2|  5
                     \ |         | /^
                    4 \|         |/5
                       2-------->4
                            3
*/ 