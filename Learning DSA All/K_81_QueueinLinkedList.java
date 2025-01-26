public class K_81_QueueinLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class QueueLinkedList{
        public static Node head= null;
        public static Node tail= null;

        public boolean isEmpty(){
            return head == null && tail == null;
        }

        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println(" Queue is empty");
                return -1;
            }

            int front = head.data;
            if(head == tail){
                head = tail = null;
            }else{   
               head = head.next;
            }
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println(" Queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();
        ql.add(25);
        ql.add(35);
        ql.add(45);

        while(!ql.isEmpty()){
            System.out.println(ql.peek());
            ql.remove();
        }
    }
}
