//connected city with minimum cost

import java.util.PriorityQueue;

public class K_177_connectCitiy {

    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost;
        }
    }

    public static int connectcities(int citis[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[citis.length];

        pq.add(new Edge(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!vis[curr.dest]) {
                vis[curr.dest] = true;
                finalCost += curr.cost;

                for (int i = 0; i < citis[curr.dest].length; i++) {
                    if (citis[curr.dest][i] != 0) {
                        pq.add(new Edge(i, citis[curr.dest][i]));
                    }
                }
            }

        }
        return finalCost;
    }



    public static void main(String[] args) {
        int cities[][] = { { 0, 1, 2, 3, 4 }, { 1, 0, 5, 0, 7 }, { 2, 5, 0, 6, 0 }, { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
        System.out.println("connecteing city = "+connectcities(cities));
    }
}
