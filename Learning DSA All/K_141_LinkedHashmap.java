import java.util.HashMap;
import java.util.LinkedHashMap;

public class K_141_LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("US", 10);
        lhm.put("india",100);
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
        System.out.println(hm.containsKey("U"));
    }
}
