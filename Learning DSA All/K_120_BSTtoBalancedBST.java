import java.util.ArrayList;

public class K_120_BSTtoBalancedBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public static Node BuildBSTree(Node root, int val) {
    // if (root == null) {
    // root = new Node(val);
    // return root;
    // }
    // if (root.data >= val) {
    // root.left = BuildBSTree(root.left, val);
    // } else {
    // root.right = BuildBSTree(root.right, val);
    // }
    // return root;
    // }

    //main methof of this Program
    public static Node CreateBBstree(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();

        //inorder seq.
        getInOrder(root, inorder);

        //sorted inorder -> balanvced BST
        root = buildBST(inorder, 0, inorder.size()-1);
        return root;
    }

    // inorder funtion
    public static void getInOrder(Node root, ArrayList<Integer> inorder) {
        if (root == null){
            return;
        }

        getInOrder(root.left, inorder);
        // System.out.print(root.data + " ");
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }

    //sorted array to balanced BSTree
    public static Node buildBST(ArrayList<Integer> inorder, int start, int end ){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = buildBST(inorder, start, mid-1);
        root.right = buildBST(inorder, mid+1, end);
        return root;
    }

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        InOrder(root.left);
        InOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        InOrder(root);
        root = CreateBBstree(root);
        InOrder(root);

    }
}
