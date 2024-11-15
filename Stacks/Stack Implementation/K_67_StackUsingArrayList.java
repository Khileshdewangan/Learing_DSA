import java.util.ArrayList;

public class K_67_StackUsingArrayList {
    public static class stack{
        ArrayList<Integer> s = new ArrayList<>();

        public boolean isEmpty(){
            return s.size() == 0;
        }

        public void push(int data){
            s.add(data);
        }
        
        public int pop(){
            if(s.isEmpty()){
                return -1;
            }
            int top = s.get(s.size()-1);
            s.remove(s.size()-1);
            return top;
        }

        public int peek(){
            return s.get(s.size()-1);
        }

    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }
    }
}
