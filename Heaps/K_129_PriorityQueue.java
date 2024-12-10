import java.util.Comparator;
import java.util.PriorityQueue;

public class K_129_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(21);
        pq.add(3);
        pq.add(8);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
    
}
