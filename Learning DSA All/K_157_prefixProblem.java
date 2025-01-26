public class K_157_prefixProblem {
    public static Node root = new Node();

    static class Node {
        Node chiNode[] = new Node[26];
        boolean endofword = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                chiNode[i] = null;
            }
            freq = 1;
        }
    }

    public static void insert(String str) {
        Node curr = root;
        for (int i = 0; i < str.length(); i++) {
            int indx = str.charAt(i) - 'a';
            if (curr.chiNode[indx] == null) {
                curr.chiNode[indx] = new Node();
            }else{
                curr.chiNode[indx].freq++;
            }
            curr = curr.chiNode[indx];
        }
        curr.endofword = true;
    }

    public static void findPrefix(Node root,String ans){

        if(root == null){
            return;
        }
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        // Node curr = root;
        for(int i=0; i<root.chiNode.length; i++){
            if(root.chiNode[i] != null){
                findPrefix(root.chiNode[i], ans+(char)(i +'a'));
            }
        }

    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "dove", "duck"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        root.freq =-1;
        findPrefix(root, "");
    }
}
