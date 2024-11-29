import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class K_104_topViewTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int horiDiam;

        public Info(Node node, int horiDiam) {
            this.node = node;
            this.horiDiam = horiDiam;
        }
    }

    public static void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.horiDiam)) {
                    map.put(curr.horiDiam, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.horiDiam - 1));
                    min = Math.min(min, curr.horiDiam - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.horiDiam + 1));
                    max = Math.max(max, curr.horiDiam + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(66);
        root.right.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        topView(root);

    }
}
