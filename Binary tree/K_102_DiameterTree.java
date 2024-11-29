public class K_102_DiameterTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
             this.left = null;
             this.right = null;
        }
    }
    static class Info {
        int diameter;
        int height;
        public Info(int diameter,int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diameterValue = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int heightValue = Math.max( leftInfo.height , rightInfo.height) + 1;

        return new Info(diameterValue, heightValue);
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int Lefth  = height(root.left);
        int Righth  = height(root.right);
        
        return Math.max(Lefth, Righth) + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int LefthD = diameter(root.left);
        int RightD = diameter(root.right);
        
        int Lefth  = height(root.left);
        int Righth  = height(root.right);

        int selfD = Lefth + Righth + 1;
        
        return Math.max(Math.max(LefthD, RightD), selfD);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.left.left = new Node(9);
        // root.left.right.right = new Node(6);
        // root.left.right.right.right = new Node(7);
        // root.left = new Node(2);
        // root.left = new Node(2);
        System.out.println("Diameter2 of tree is : "+diameter2(root).height);
        System.out.println("Diameter of tree is : "+diameter(root));
    }
}
