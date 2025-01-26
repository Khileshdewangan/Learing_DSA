public class K_113_SearchBST {
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

    public static Boolean searchBST(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return searchBST(root.left, key);
        }else{
            return searchBST(root.right, key);
        }
        // return true;
    }
    public static void main(String[] args) {
        int nodes[] = {8,4,7,1,2,9};
        Node root = null;
        for(int i= 0; i<nodes.length;i++){
            root = BuildBSTree(root, nodes[i]);
        }
        if(searchBST(root, 8)){
            System.out.println("found");
        }else{
           System.out.println("Not found");
        }
    }
}
