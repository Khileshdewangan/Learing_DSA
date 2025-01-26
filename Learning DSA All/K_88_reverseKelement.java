import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class K_88_reverseKelement {
    public static void reverseelement(Queue<Integer> q, int k){
        Stack<Integer> s= new Stack<>();
        // Queue<Integer> qnew = new LinkedList<>();
        for(int i=0; i<k;i++){
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());            
        }

        for(int i=k; i<q.size(); i++){
            q.add(q.remove());
        }
        // while (!q.isEmpty()) {
        //     qnew.add(q.remove());            
        // }

        // System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); 
        q.add(20); 
        q.add(30); 
        q.add(40); 
        q.add(50); 
        q.add(60); 
        q.add(70); 
        q.add(80); 
        q.add(90); 
        q.add(100); 
        int k =5;
        reverseelement(q,k);
        System.out.println(q);

    }
}
