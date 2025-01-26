public class K_62_DoubleLL {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFIrst(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==  null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==  null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void insertAtPosition(int position, int data){
        Node newNode = new Node(data);
        Node curr = head;
        if(position ==  1){
            addFIrst(data);
            return;
        }
        else{
           
            int currposition = 1;
            while(curr != null && currposition < position){
                curr = curr.next;
                currposition++;
            }
        }
            if(curr == null){
                addLast(data);
            }
            else{
                newNode.next = curr;
                newNode.prev = curr.prev;
                curr.prev.next = newNode;
                curr.prev = newNode;
            }
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Double linked list is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            return;
        }
        head =head.next;
        head.prev = null;
        size--;
        return;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("Double linked list is empty");
            return;
        }
        if(head== tail){
        // if(size == 1){
            head = tail = null;
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        return;
    }

    public void reverseDll(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print (){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");   
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        K_62_DoubleLL Dll = new K_62_DoubleLL();
        Dll.addFIrst(2);  
        Dll.addFIrst(5);  
        Dll.addFIrst(8);
        Dll.addLast(66);        
        // Dll.insertAtPosition(3,99);
        Dll.print();
        Dll.reverseDll();
        Dll.print(); 
        // Dll.removeFirst();
        // Dll.print();  
        // Dll.removeLast();
        // Dll.print();  
         
         
    }
}
