public class K_115_PrintinRange {

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

    public static void printInrange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInrange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInrange(root.right, k1, k2);
        } else if (root.data > k1) {
            printInrange(root.left, k1, k2);
        } else {
            printInrange(root.right, k1, k2);

        }
    }

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BuildBSTree(root, nodes[i]);
        }
        InOrder(root);
        System.out.println();
        printInrange(root, 10, 14);
    }
}
