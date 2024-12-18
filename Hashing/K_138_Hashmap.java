import java.util.HashMap;

public class K_138_Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Nepal", 20);

        // map.clear();
        System.out.println(map);
        // System.out.println(map.containsKey("China"));
        // System.out.println(map.containsValue(10));
        System.out.println(map.get("india"));
        // System.out.println(map.remove("nepal"));
        // // map.remove("Nepal");
        // System.out.println(map);
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.size());
        // System.out.println(map.isEmpty());
    }
}
