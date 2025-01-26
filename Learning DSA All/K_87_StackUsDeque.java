import java.util.Deque;
import java.util.LinkedList;

public class K_87_StackUsDeque {

    static class Stack{
        Deque <Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue{
        Deque <Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("stack data");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        Queue q = new Queue();
        q.add(11);
        q.add(22);
        q.add(33);
        System.out.println("Queue data");
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
