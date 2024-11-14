public class K_61_CreateLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int indx, int data){
        if (indx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<indx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        int val  = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // public static int itrSearch(int key){
    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int indx = helper(head.next, key);
        if(indx == -1){
            return -1;
        }
        return indx+1;
    }

    public int recSearch(int key ){
        return helper(head,key);
    }

    public void deleteFOrmEnd(int n){
        int size =0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            size++;
        } 

        if(n==size){
            head = head.next;
            return;
        }

        int i=1;
        int iToFind = size-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next2;
        while (curr != null) {
            next2 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next2;
        }
        head = prev;
    }

    public Node findMid(Node hrad){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkplindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // find mid
        Node mid = findMid(head);

        //reverse linkedlist from mid
        Node prev = null;
        Node curr = mid;
        Node next2;
        while(curr != null){
            next2 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next2;
        }

        Node  left = head ;
        Node right = prev;
        
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                return true;
            }
        }
        return false;
    }

    public static void deleteCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast= fast.next;
        }
        prev.next = null;

    }

    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //its mid 
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid  
        Node mid = getmid(head);

        // right and left margeSort 
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newright = mergeSort(rightHead);

        //mergeing
        return merge(newleft, newright);
    }

    private Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                // temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                // temp = temp.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public void zigzg(){
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next != null){
            slow =slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        Node prev = null;
        mid.next = null;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while ( left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left= nextL;
            right = nextR;
        }

    }
    public static void main(String[] args) {
        /*
        <------------------------- detect a cycle node and and delete cycle node--------------->
        head = new Node(1);
        Node temp  = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        deleteCycle();
        System.out.println(isCycle());
        */


        
        K_61_CreateLinkedList ll = new K_61_CreateLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.zigzg();
        ll.print();

        /* <----------------for mergeSort--------------->
        ll.addFirst(18);
        ll.addFirst(52);
        ll.addFirst(36);
        ll.addFirst(4853);
        ll.addFirst(50);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

        */
        // ll.add(0,88);
        
        // System.out.println("Size of linked list is  :"+ ll.size);
        // System.out.println("remove first element of linked list  :"+ll.removeFirst());
        // System.out.println("remove last element of linked list  :"+ll.removelast());
        // ll.print();
        // int a = ll.recSearch(11);
        // System.out.println(a);
        // ll.deleteFOrmEnd(5);
        // ll.print();
        // // ll.reverseLL();
        // ll.print();
        
        // System.out.println(ll.checkplindrome());
        

    }  
    

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
    }
}