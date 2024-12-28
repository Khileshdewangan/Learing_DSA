public class K_159_countuniquesubstring {
    public static Node root = new Node();

    static class Node {
        Node chiNode[] = new Node[26];
        boolean endofword = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                chiNode[i] = null;
            }
        }
    }

    public static void insert(String str) {
        Node curr = root;
        for (int i = 0; i < str.length(); i++) {
            int indx = str.charAt(i) - 'a';
            if (curr.chiNode[indx] == null) {
                curr.chiNode[indx] = new Node();
            }
            curr = curr.chiNode[indx];
        }
        curr.endofword = true;
    }

    public static int countUniqueSubString(Node root) {
        // Node curr = root;
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if(root.chiNode[i] != null){
                count += countUniqueSubString(root.chiNode[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "khilesh";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println("total number of unique substring is : " + countUniqueSubString(root));
    }
}
