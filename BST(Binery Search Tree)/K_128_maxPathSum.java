public class K_128_maxPathSum {
    static class Node {
        int data;
        Node left, right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }

    static class Res {
        public int value;
    }

    public static int findMaxUtill(Node root, Res result){
        if(root== null){
            return 0;
        }
        int l = findMaxUtill(root.left, result);
        int r = findMaxUtill(root.right, result);

        int max_single = Math.max(Math.max(l,r)+ root.data, root.data);

        int max_top = Math.max(max_single, l+r+root.data);

        result.value = Math.max(result.value, max_top);

        return max_single;
    }

    public static int findMaxSum(Node root){
        Res result = new Res();
        result.value = Integer.MAX_VALUE;
        findMaxUtill(root, result);
        return result.value;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);

        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);
        System.out.println(findMaxSum(root));
    }
}
