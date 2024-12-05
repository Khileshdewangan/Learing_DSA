import java.util.ArrayList;

public class K_123_Merge2BST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        inorder(root.left, inorder);
        inorder.add(root.data);
        inorder(root.right, inorder);
    }

    public static Node merge(Node root1, Node root2){
        //step - 1
        ArrayList<Integer> path1 = new ArrayList<>();
        inorder(root1, path1);
        
        //step - 2
        ArrayList<Integer> path2 = new ArrayList<>();
        inorder(root2, path2);

        //merge path1 & path2
        ArrayList<Integer> finalarr = new ArrayList<>();
        int i=0,j=0;
        while(i < path1.size() && j < path2.size()){
            if(path1.get(i) <= path2.get(j)){
                finalarr.add(path1.get(i));
                i++; 
            }else{
                finalarr.add(path2.get(j));
                j++;
            }
        }
        while (i < path1.size()) {
            finalarr.add(path2.get(i));
            i++;
        }
        while (j<path1.size()) {
            finalarr.add(path2.get(j));
            j++; 
        }
        // Sorted array  -> balance BST
        return createBST(finalarr, 0,finalarr.size()-1);
    }

    public static Node createBST(ArrayList<Integer> finalarr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end)/2;
        Node root = new Node(finalarr.get(mid));
        root.left = createBST(finalarr, start, mid-1);
        root.right = createBST(finalarr, mid+1, end);

        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = merge(root1, root2);
        preorder(root);
    }
}