public class K_158_startwithProblem {
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

    public static boolean startWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int indx = prefix.charAt(i) - 'a';
            if (curr.chiNode[indx] == null) {
                return false;
            }
            curr = curr.chiNode[indx];
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[] = { "appe", "mango", "banana", "man", "app", "woman" };
        String prefix = "man";
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        System.out.println(startWith(prefix));
    }
}
