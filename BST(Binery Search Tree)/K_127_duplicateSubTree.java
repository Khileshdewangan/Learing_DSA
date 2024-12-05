import java.util.HashMap;

public class K_127_duplicateSubTree {
    static class Node {
        int data;
        Node left, right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }

    static HashMap<String , Integer> m = new HashMap<>();

    public static String duplicaString(Node root){
        if(root == null){
            return "";
        }

        String str = "(";
        str += duplicaString(root.left);
        str += Integer.toString(root.data);
        str += duplicaString(root.right);
        str += ")";

        if(m.get(str) != null && m.get(str) != 1 ){
            System.out.print(root.data +" ");
        }
        if(m.containsKey(str)){
            m.put(str,m.get(str)+1);
        }else{
            m.put(str,1);
        }
        return str;
    }

    public static void preprintAllDuporder(Node root) {
     m = new HashMap<>();
     duplicaString(root);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);
        System.out.println();
        preprintAllDuporder(root);

}
}