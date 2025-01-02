import java.util.ArrayList;

public class K_161_AdjacencyList2 {
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
    public static void main(String[] args) {
        int v= 5;
        //int arr[] = new int[size];
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i=0; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
            // System.out.println(graph.length);
        }

        //0 - vertex
        graph[0].add(new Edge(0,1,5));

        //1 - vertex        
        graph[1].add(new Edge(1, 0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //2 - vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        //3 - vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        //4 - vertex
        graph[4].add(new Edge(4,2,2));

        //2's neigbours
        for(int i=0; i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.dist);
        }
    }
}
