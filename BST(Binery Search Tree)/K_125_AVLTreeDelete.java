public class K_125_AVLTreeDelete {
    static class Node{
        int data, height;
        Node left,right;
        
        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    public static Node root;
    public static Node getMinNode(Node root){
        Node curr = root;

        //min data is at left-most data
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    public static int getBalance(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left) - height(root.right) ;
    }

    //right rotate subtree rooted with y
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        //rotate using 3 nodes
        x.right = y;
        y.left = T2;

        //update height
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        //x is new root
        return x;
    }

    //left rotate subtree rooted with x
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //rotate using 3 nodes
        y.left = x;
        x.right = T2;

         //update height
        x.height = Math.max(height(x.left), height(x.right)) + 1 ;
        y.height = Math.max(height(y.left), height(y.right)) + 1 ;

        //y is new root
        return y;
    }

    public static Node deleteNode(Node root, int key){
        if(root == null){
            return root;
        }

        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else{

            if(root.left == null || root.right == null){
                Node temp = null;
                if(temp == root.left){
                    temp = root.right;
                }else{
                    temp = root.left;
                }

                if(temp == null){
                    temp = root;
                    root = null;
                }else{
                    root = temp;
                }
            }
            else{
                Node temp = getMinNode(root.right);

                root.data = temp.data;

                root.right = deleteNode(root.right, temp.data);

            }
        }

        if(root == null){
            return null;
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int bf = getBalance(root);

        //left left case
        if(bf > 1 && getBalance(root.left) >= 0){
            return rightRotate(root);
        }

        //left right Case
        if(bf > 1 && getBalance(root.left) < 0){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //right right Case
        if(bf < -1 && getBalance(root.right) <= 0){
            return leftRotate(root);
        }
        if(bf < -1 && getBalance(root.right) > 0){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
    public static Node insert(Node root, int key){
        if(root == null){
            return (new Node(key));
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }else{
            //duplicate values are not allows
            return root;
        }

        //update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        //get root balance factors
        int bf = getBalance(root);

        //left left case
        if(bf > 1 && key < root.left.data){
            return rightRotate(root);
        }

        //right right case
        if(bf < -1 && key > root.right.data){
            return leftRotate(root);
        }

        //left right  case
        if(bf > 1 && key > root.left.data){
            root.left =  leftRotate(root.left);
            return rightRotate(root);
        }
        //right left case
        if(bf < -1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        //return if AVL Balanced
        return root;
    }


    public static void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        preorder(root);
        System.out.println();
        deleteNode(root, 30);
        preorder(root);
        // System.out.println();
    }
}
