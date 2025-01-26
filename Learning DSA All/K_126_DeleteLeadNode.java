public class K_126_DeleteLeadNode {
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

    public static Node deletrLeafNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        root.left = deletrLeafNode(root.left, key);
        root.right = deletrLeafNode(root.right, key);
        if (key == root.data && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(2);
        preorder(root);
        System.out.println();
        deletrLeafNode(root, 2);
        preorder(root);

    }
}
