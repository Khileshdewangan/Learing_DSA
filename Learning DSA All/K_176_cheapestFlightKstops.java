import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class K_176_cheapestFlightKstops {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void creategraph(int flight[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class INFO{
        int v;
        int cost;
        int stops;
        public INFO(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static int  cheapestflight(int n, int flight[][], int src , int dest, int k){
        ArrayList<Edge> graph[] = new ArrayList[n];

        creategraph(flight, graph);

        int dist[] = new int[n];
        for(int i=0; i<n; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<INFO> q = new LinkedList<>();
        q.add(new INFO(src, 0, 0));

        while(!q.isEmpty()){
            INFO curr = q.remove();
            if(curr.stops > k){
                break;
            }

            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);

                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

                // if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]  && curr.stops <= k){
                //     dist[v] = dist[u] + wt;
                //     q.add(new INFO(v, dist[v], curr.stops+1));
                // }

                //another option
                if(curr.cost + wt < dist[v]  && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    q.add(new INFO(v, dist[v], curr.stops+1));
                }
            }
        }

        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }

    public static void main(String[] args) {
        int flight[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int n = flight.length;
        int src = 0;
        int dest = 3;
        int k = 1;
        System.out.println("Cost = "+cheapestflight(n, flight, src, dest, k));
    }
}
