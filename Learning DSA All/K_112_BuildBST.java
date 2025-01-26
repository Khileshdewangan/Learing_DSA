public class K_112_BuildBST {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
           this.data = data;
           this.left = null;
           this.right = null; 
        }
    }

    public static Node BuildBSTree(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data >= val){
            root.left = BuildBSTree(root.left, val);
        }
        else{
            root.right = BuildBSTree(root.right, val);
        }
        return root;
    }
    public static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+ " ");
        InOrder(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = {8,4,7,1,2,9};
        Node root = null;
        for(int i= 0; i<nodes.length;i++){
            root = BuildBSTree(root, nodes[i]);
        }
        InOrder(root);
    }
}
