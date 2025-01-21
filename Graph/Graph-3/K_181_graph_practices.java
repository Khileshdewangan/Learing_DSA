import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class K_181_graph_practices {

    public static void addEdge(ArrayList<Integer>[] graph, int u, int v) {
        graph[u].add(v);
        graph[v].add(u);
    }

    public static void BFSsearch(ArrayList<Integer>[] graph, int src) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];

        q.add(src);
        visited[src] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                int nbr = graph[curr].get(i);
                if (visited[nbr] == false) {
                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
        }
    }

    //cycle detection funtion
    public static void BFSsearch2(ArrayList<Integer>[] graph, int src) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        
        q.add(src);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if(visited[curr] == true){
                System.out.println("cycle detect");
            }

            //removal time visited
            visited[curr] = true;
            System.out.println(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                int nbr = graph[curr].get(i);
                if (visited[nbr] == false) {
                    q.add(nbr);
                }
            }
        }
    }

    public static void BFS_level(ArrayList<Integer> [] graph, int src){
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;
        int level = 0;

        while (q.size()>0) {
            int size = q.size();
            System.out.println("level is : " + level+" ");

            while(size > 0){
                int u = q.remove();
                for(int i=0; i<graph[u].size(); i++){
                    int nbr = graph[u].get(i);
                    if(visited[nbr]==false){
                        visited[nbr] = true;
                        System.out.print(nbr + " ");
                        q.add(nbr);
                    }
                }
                size--;
            }
            System.out.println();
            level++;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer>[] graph = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);
        addEdge(graph, 2, 4);

        // print

        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + "--> ");
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.print(graph[i].get(j) + " ");
            }
            System.out.println();
        }

        // BFSsearch(graph, 0);
        // BFSsearch2(graph, 0);
        BFS_level(graph, 0);
    }
}
