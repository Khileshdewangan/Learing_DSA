import java.util.PriorityQueue;

public class K_136_slidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int value, idx;
        public Pair(int value, int idx){
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            //asending
            // return this.value - p2.value;
            //decending
            return p2.value - this.value;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int result[] = new int[arr.length-k+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<k; i++){
            pq.add(new Pair(arr[i], i));
        }

        result[0] = pq.peek().value;

        for(int j = k; j<arr.length; j++){
            while(pq.size() > 0 && pq.peek().idx <= (j-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[j], j ));
            result[j-k+1] = pq.peek().value;
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
