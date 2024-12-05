import java.util.ArrayList;

public class K_116_printRootLeafpath {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node BuildBSTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data >= val) {
            root.left = BuildBSTree(root.left, val);
        } else {
            root.right = BuildBSTree(root.right, val);
        }
        return root;
    }

    public static void printLeafPath(ArrayList<Integer> path, Node root){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        printLeafPath(path, root.left);
        printLeafPath(path, root.right);
        path.remove(path.size()-1);
    }

    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i< path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("->null");
    }
    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 6, 10, 11,14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BuildBSTree(root, nodes[i]);
        }
        printLeafPath(new ArrayList<>(), root);
    }
}
