public class K_114_DeleteBST {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
           this.data = data;
           this.left = null;
           this.right = null; 
        }
    }

    public static Node BuildBSTree(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data >= val){
            root.left = BuildBSTree(root.left, val);
        }
        else{
            root.right = BuildBSTree(root.right, val);
        }
        return root;
    }

    public static Node deleteBST(Node root, int val){
        if(root.data > val){
            root.left = deleteBST(root.left, val);
        }
        else if(root.data < val){
            root.right = deleteBST(root.right, val);
        }
        else{
            // Case 1 (Leaf Node)
            if(root.left == null && root.right ==null){
                return null;
            }
            
            //case 2(Single child)
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //Case 3(Two child)
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteBST(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root != null) {
            root = root.left;
        }
        return root;
    }

    public static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+ " ");
        InOrder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = {8,4,7,1,2,9};
        Node root = null;
        for(int i= 0; i<nodes.length;i++){
            root = BuildBSTree(root, nodes[i]);
        }

        root = deleteBST(root, 7);
        InOrder(root);
    }
}
