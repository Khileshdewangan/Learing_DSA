// import java.util.Comparator;
import java.util.PriorityQueue;

public class K_130_PQforObject {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student S2){
            return this.rank - S2.rank;

        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("khilesh", 5));
        pq.add(new Student("dewangan", 1));
        pq.add(new Student("shailend", 3));
        pq.add(new Student("satish", 15));
        pq.add(new Student("ram", 50));

        while(!pq.isEmpty()){
            System.err.println(pq.peek().name +" ---> " +  pq.peek().rank);
            pq.remove();
        }
    }
}
