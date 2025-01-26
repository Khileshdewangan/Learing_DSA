import java.util.LinkedList;
import java.util.Queue;

public class K_85_interleaveTwoHalves {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> haifq = new LinkedList<>();
        int size = q.size()/2;

        for(int i=0; i<size;i++){
            haifq.add(q.remove());
        }
        while(!haifq.isEmpty()){
            q.add(haifq.remove());
            q.add(q.remove());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);
        interleave(q);
        System.out.println(q);
    

    }
}
