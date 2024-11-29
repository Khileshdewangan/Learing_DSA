public class K_106_InvertTree {
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

    public static Node Invert(Node root){
        if(root == null){
            return root;
        }

        Node newNode = new Node(root.data);

        Node leftInvert = Invert(root.left);
        Node rightInvert = Invert(root.right);

        newNode.left = rightInvert;
        newNode.right= leftInvert;

        // root.left = Invert(root.right);
        // root.right = Invert(root.left);

        return newNode;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(66);
        root.right.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        PrintTree(root);
        System.out.println();
        
        PrintTree(Invert(root));

    }
}
