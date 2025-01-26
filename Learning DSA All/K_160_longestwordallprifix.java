public class K_160_longestwordallprifix {
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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.chiNode[i] != null && root.chiNode[i].endofword == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.chiNode[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }

        }

    }

    public static void main(String[] args) {
        String word[] = { "apple", "app", "banana", "a", "ap", "appl", "apply" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}