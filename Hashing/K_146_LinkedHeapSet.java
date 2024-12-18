import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class K_146_LinkedHeapSet {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        set1.add("indian");
        set1.add("raipur");
        set1.add("raipur");
        set1.add("bhilai");
        set1.add("durg");
        System.out.println(set1);


        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("indian");
        set.add("raipur");
        set.add("raipur");
        set.add("bhilai");
        set.add("durg");
        System.out.println(set);

        //itrator

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
