import java.util.PriorityQueue;

public class K_89_ConnectNropes {
    public static int connectropes(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int profit = 0;

        for(int i=0; i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(pq.size() >= 2){
            int p1 = pq.poll();
            int p2 = pq.poll();
            int p = p1+p2;
            pq.add(p);

            profit = profit + p;
        }

    return profit;
    }
    public static void main(String[] args) {
        int arr [] = {4,3,2,6};
        System.out.println(connectropes(arr));
    }
}
