import java.util.LinkedList;
import java.util.Queue;

public class K_83_StackUsingTwoQueue {
    static class StackTQueue{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean Kmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public void add(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        public int remove(){
            if(Kmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public int peek(){
            if(Kmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String[] args) {
        StackTQueue sq = new StackTQueue();
        sq.add(55);
        sq.add(152);
        sq.add(110);

        while(!sq.Kmpty()){
            System.out.println(sq.remove());
            // sq.remove();
        }
    }
}
