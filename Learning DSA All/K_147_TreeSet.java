import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class K_147_TreeSet {
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


        TreeSet<String> ts = new TreeSet<>();
        ts.add("indian");
        ts.add("raipur");
        ts.add("raipur");
        ts.add("bhilai");
        ts.add("durg");
        ts.add("durg");
        System.out.println(ts);
    }
}
