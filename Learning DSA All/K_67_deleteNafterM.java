public class K_67_deleteNafterM {
    static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static void deleteN(Node head, int n, int m){
        Node curr = head, t;
        while(curr != null){
            for(int i=1; i<m && curr != null; i++ ){
                curr = curr.next;
            }
            if(curr == null){
                return;
            }
            t = curr.next;
            for(int i=0; i<n && t != null; i++ ){
                Node temp = t;
                t = t.next;
            }
            curr.next= t;
            curr = t;
        }
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node newNode = new Node(2);
        head1.next = newNode;
        newNode = new Node(3);
        head1.next.next = newNode;
        newNode = new Node(4);
        head1.next.next.next = newNode;
        newNode = new Node(5);
        head1.next.next.next.next = newNode;
        print(head1);
        deleteN(head1,1,2);
        print(head1);

    }
}
