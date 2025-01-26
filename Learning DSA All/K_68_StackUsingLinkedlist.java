public class K_68_StackUsingLinkedlist {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
             this.next = null;
        }
    }
    
    public static class stack{
        static Node head;

        public boolean isEmpty(){
            return head == null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(head == null){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(25);
        s.push(125);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }

    }
}
