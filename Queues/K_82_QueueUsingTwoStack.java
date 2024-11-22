import java.util.Stack;

public class K_82_QueueUsingTwoStack {

    static class QueueTStack{
        static Stack<Integer> S1 = new Stack<>();
        static Stack<Integer> S2 = new Stack<>();
        
        public static boolean KEmpty(){
            return S1.isEmpty();
        }

        public void add(int data){
            while(!S1.isEmpty()){
                S2.push(S1.pop());
            }
            S1.push(data);
            while(!S2.isEmpty()){
                S1.push(S2.pop());
            }
        }

        public int remove(){
            if(S1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return S1.pop();
        }
        public int peek(){
            if(S1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return S1.peek();
        }
    } 
    public static void main(String[] args) {
        QueueTStack qs = new QueueTStack();
        qs.add(55);
        qs.add(152);
        qs.add(110);

        while(!qs.KEmpty()){
            System.out.println(qs.remove());
            // sq.remove();
        }
    }
}
