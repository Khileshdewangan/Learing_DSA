public class K_117_validBST {
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

    public static boolean validBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return validBST(root.left, min, root) && validBST(root.right,root, max);
    }
    public static void main(String[] args) {
        int nodes[] = { 8,8,8,8 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BuildBSTree(root, nodes[i]);
        }
        // validBST(root, null,null);
       if(validBST(root, null,null)){
        System.out.println("Valid BST");
       }else{
        System.out.println("Not Valid BST");
       }
    }
}
