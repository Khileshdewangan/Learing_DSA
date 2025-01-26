public class K_103_subtreeofAnotherTree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Boolean isSubTree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        boolean leftAns = isSubTree(root.left, subRoot);
        boolean rightAns = isSubTree(root.right, subRoot);

        return leftAns || rightAns ;
    }

    public static Boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }
        
        if( !isIdentical(root.left, subRoot.left)){
            return false;
        }
        if( !isIdentical(root.right, subRoot.right)){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node subrrot = new Node(2);
        subrrot.left = new Node(4);
        subrrot.right = new Node(5);

        System.out.println("subroot : "+isSubTree(root, subrrot));
    }
}
