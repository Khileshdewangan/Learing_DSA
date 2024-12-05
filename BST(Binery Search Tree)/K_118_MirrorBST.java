public class K_118_MirrorBST {
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

    public static Node mirrorBST(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = mirrorBST(root.left);
        Node rightMirror = mirrorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 6, 10, 11,14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BuildBSTree(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();
        mirrorBST(root);
        inOrder(root);

    }
}
