public class K_105_UnivaluedBTree {
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

    public static boolean isUnvalued(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }
        boolean LeftUnvalued = isUnvalued(root.left);
        boolean rightUnvalued = isUnvalued(root.right);
        return LeftUnvalued || rightUnvalued;
    }

    public static void PrintTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PrintTree(root.left);
        PrintTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        System.out.println("Binary Tree Unvalued is : " + isUnvalued(root));
    }
}
