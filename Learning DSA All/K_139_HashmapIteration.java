import java.util.*;

public class K_139_HashmapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 100);
        map.put("China", 150);
        map.put("US", 10);
        map.put("Nepal", 20);


        Set<String> key = map.keySet();
        System.out.println(key);

        System.out.println();
        for (String key1 : map.keySet()) {
            System.out.println(key1);
        }

        System.out.println();
        for (String key1 : map.keySet()) {
            System.out.println("key: " + key1 + ", value: "+ map.get(key1));
        }
        System.out.println();

        // for (Integer key : map.values()) {
        //     System.out.println(key);
        // }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    }
}
