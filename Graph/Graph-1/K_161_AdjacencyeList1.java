import java.util.ArrayList;

public class K_161_AdjacencyeList1 {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0; i<v; i++){
            // graph.add(new ArrayList<Integer>());
            ArrayList<Integer> temp = new ArrayList<>();
            graph.add(temp);
        }
    
        ArrayList<Integer> temp = graph.get(1);
        temp.add(2);
    
        graph.get(2).add(1);
        graph.get(1).add(3);
        graph.get(3).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(3);
    
        for(int i=0; i< graph.size(); i++){
            System.out.print(i + " -->");
            for(int j =0; j<graph.get(i).size(); j++){
                System.out.print(graph.get(i).get(j) + "-->");
            }
    
            System.out.println();
        }
    }   
}
/*

*/