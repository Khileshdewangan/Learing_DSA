// import java.util.ArrayList;

public class K_119_SortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node createBBST(int [] arr , int start , int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        
        root.left = createBBST(arr, start, mid-1);
        root.right = createBBST(arr, mid+1, end);

        return root;
    }

    public static void Inorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        Inorder(root.left);
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,9,10,15,18};
        Inorder(createBBST(arr, 0, arr.length-1));
     
    }
}
