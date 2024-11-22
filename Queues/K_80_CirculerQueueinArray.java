public class K_80_CirculerQueueinArray {
    static class CirculerQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public CirculerQueue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        public boolean isfull(){
            return (rear + 1)% size == front ;
        }

        public void add(int data){
            if(isfull()){
                System.err.println("Queue is full");
                return;
            }
            if(front ==- 1){
                front = (front+1)%size;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{

                front = (front+1)%size;
            }
            return result;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        CirculerQueue cq = new CirculerQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        System.out.println(cq.remove());
        cq.add(4);
        System.out.println(cq.remove());
        cq.add(5);
        while(!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
