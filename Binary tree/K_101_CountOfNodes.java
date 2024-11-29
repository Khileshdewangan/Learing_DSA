public class K_101_CountOfNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int Lheight = height(root.left);
        int  Rheight = height(root.right);
        return Math.max(Lheight, Rheight) + 1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lcount = count(root.left);
        int Rcount = count(root.right);
        return lcount + Rcount + 1;
    }

    public static int sumofNodes(Node root){
        if(root == null){
            return 0;
        }
        int Lsum = sumofNodes(root.left);
        int Rsum = sumofNodes(root.right);
        return Lsum + Rsum + root.data;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =new Node (2);
        root.right =new Node (3);
        root.left.left =new Node (4);
        root.left.right =new Node (5);
        root.right.left =new Node (6);
        root.right.right =new Node (7);
        // root.right.right.left =new Node (10);
        System.out.println(sumofNodes(root));
    }
}
