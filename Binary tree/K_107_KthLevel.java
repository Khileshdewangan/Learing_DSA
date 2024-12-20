public class K_107_KthLevel {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void PrintTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PrintTree(root.left);
        PrintTree(root.right);
    }

    public static void KLevel(Node root, int level, int k){
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        KLevel(root.left, level+1, k);
        KLevel(root.right, level+1, k);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        KLevel(root, 1,3);
        // PrintTree(root);
    }
}
