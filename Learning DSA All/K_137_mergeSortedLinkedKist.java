import java.util.PriorityQueue;

public class K_137_mergeSortedLinkedKist {
    static class Node implements Comparable<Node>{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

        @Override
        public int compareTo(Node n2){
            return this.data - n2.data;
        }
    }

    public static Node mergeKList(Node [] arr, int k){
       PriorityQueue<Node> queue = new PriorityQueue<>();
       Node head = new Node(0);
       Node last = head;

       //push the head nodes of all
       //the k list in priority_queue
       for(int i = 0; i<k; i++){
            if(arr[i] != null){
                queue.add(arr[i]);
            }
       }

       //handles with case when k=0;
       //or list have no element in them

       if(queue.isEmpty()){
            return null;
       }

        //loop till queue is not empty
       while (!queue.isEmpty()) {
        //get the top element in priorty queue
        Node curr = queue.poll();

        //add th top element of priority_queue
        //to the resultent merge list
        last.next = curr;
        last = last.next;

        //check if there is node 
        //next to the ntop node
        //in the list of which top
        //node is a member
        if(curr.next != null){
            //push the next node of the top node
            //in queue
            queue.add(curr.next);
        }

        // address of head node of the required
        //marge list
        }
        return head.next;
    }

    public static void printLinkedlist(Node res){
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;            
        }
    }
    public static void main(String[] args) {
        int n = 3;
        Node [] a = new Node[n];

        //linkedList1-->1,3,5,7;
        Node head1 = new Node(1);
        a[0] = head1;
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);
        
        //linkedList2-->2,4,6,8;
        Node head2 = new Node(2);
        a[1] = head2;
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        
        //linkedList3-->0,9,10,11;
        Node head3 = new Node(0);
        a[2] = head3;
        head3.next = new Node(9);
        head3.next.next = new Node(10);
        head3.next.next.next = new Node(11);
        Node res = mergeKList(a, n);

        if(res != null){
            printLinkedlist(res);
        }
    }
}
