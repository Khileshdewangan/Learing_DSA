public class K_155_Tries {

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

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int indx = key.charAt(i) - 'a';
            if (curr.chiNode[indx] == null) {
                return false;
            }
            curr = curr.chiNode[indx];
        }
        return curr.endofword == true;
    }

    public static void main(String[] args) {
        String Word[] = { "khilesh", "dewangan", "the", "their", "there" };

        for (int i = 0; i < Word.length; i++) {
            insert(Word[i]);
        }

        System.out.println(search("their"));
    }
}