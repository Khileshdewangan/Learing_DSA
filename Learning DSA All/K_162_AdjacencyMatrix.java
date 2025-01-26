public class K_162_AdjacencyMatrix {
    public static void main(String[] args) {
        int V = 5;
        int E = 6;
        int graph[][] = new int[V][V];

        graph[0][1] = 1;
        graph[0][2] = 1;
        graph[1][2] = 1;
        graph[2][3] = 1;
        graph[3][4] = 1;
        graph[1][4] = 1;

        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[0].length; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
