import java.util.HashSet;

public class K_145_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(2);
        System.out.println(set);

        // set.remove(2);

        if (set.contains(2)) {
            System.out.println("hai bhai");
        } else {
            System.out.println("nhi h bhai");
        }
        set.clear();
        System.out.println( set.size() );
        
    }
}