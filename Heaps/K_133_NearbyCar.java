import java.util.PriorityQueue;

public class K_133_NearbyCar {

    static class point implements Comparable<point>{
        int x;
        int y;
        int distsqr;
        int idx;
        point(int x, int y, int distsqr, int idx){
            this.x = x;
            this.y = y;
            this.distsqr = distsqr;
            this.idx = idx;
        }
        @Override
        public int compareTo(point p){
            return this.distsqr - p.distsqr;
        }
    }

    public static void main(String[] args) {
    int ptr[][] = {{3,3}, {5,-1}, {-2,4}};
    int k=2;
    PriorityQueue<point> p = new PriorityQueue<>();

    for(int i=0; i<ptr.length; i++){
        int distsqr = ptr[i][0] * ptr[i][0] + ptr[i][1] * ptr[i][1];
        p.add(new point(ptr[i][0], ptr[i][1],distsqr,i));
    }

    for(int i=0; i<k; i++){
        System.out.println(p.remove().idx);
    }
    }
}
