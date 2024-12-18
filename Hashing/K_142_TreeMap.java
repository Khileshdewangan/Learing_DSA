import java.util.HashMap;
import java.util.TreeMap;

public class K_142_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> lhm = new TreeMap<>();
        lhm.put("US", 10);
        lhm.put("ic",100);
        lhm.put("ia",111);
        lhm.put("China", 150);
        lhm.put("Nepal", 20);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india",100);
        hm.put("india", 100);
        hm.put("China", 150);
        hm.put("US", 10);
        hm.put("Nepal", 20);


        System.out.println(lhm);
        System.out.println(hm);
    }
}
