public class K_67_intersectionTwoNode {
    static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    // public static Node getintersection(Node headA, Node headB){
    //     Node temp1 = headA;
    //     Node temp2 = headB;
    //     while (temp1 != temp2) {
    //         temp1 = temp1.next;
    //         temp2 = temp2.next;

    //         if(temp1 == null && temp2 == null){
    //             return null;
    //         }
    //         if(temp1 == null){
    //             temp1 = headB;
    //         }
    //         if(temp2 == null){
    //             temp2 = headA;
    //         }
    //     }
    //     return head;
    // }

    public static boolean getintersection(Node headA, Node headB){
        Node temp1 = headA;
        Node temp2 = headB;
        while (temp1 != null) {
            while (temp2 != null) {
                if(temp1 == temp2){
                    return true;
                }
                temp2 = temp2.next;
            }
            temp2 = headB;
            temp1 = temp1.next;
        }
        return false;
    }
     
    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
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

        Node head2 = new Node(8);
        newNode = new Node(9);
        head2.next = newNode;
        newNode = new Node(10);
        head2.next.next = newNode;
        head2.next.next.next = head1.next.next.next;

        boolean h = getintersection(head1, head2);
        if(h == true){
            System.out.println("its itersection linked list");
        }
        else{
            System.out.println("its not itersection linked list");
        }

        // while(head1 != null){
        //     System.out.print(head1.data + "-->");
        //     head1 = head1.next;
        // }
        // System.out.println( "null");
        // while(head2 != null){
        //     System.out.print(head2.data + "-->");
        //     head2 = head2.next;
        // }
        // System.out.println( "null");
    }
}
