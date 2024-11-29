public class K_111_SumTree {
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

    public static int transformSumTree(Node root){
        if(root == null){
            return 0;
        }
        int data = root.data;
        int leftSum = transformSumTree(root.left);
        int rightSum = transformSumTree(root.right);

        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;
       root.data = newleft + leftSum + newright + rightSum;

        return data ;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right = new Node(7);
        // PrintTree(root);
        System.out.println( transformSumTree(root));
        // transformSumTree(root);
        // PrintTree(root);
    }
}
