import java.util.HashMap;

public class K_150_ItineraryFromTickets {

    public static String getStart(HashMap<String, String > tickets){
        HashMap<String, String> revmap = new HashMap<>();    

        for(String key : tickets.keySet()){
            revmap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengulure");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String startpoint = getStart(tickets);

        System.out.print(startpoint);

        for(String key : tickets.keySet()){
            System.out.print(" --> "+ tickets.get(startpoint));
            startpoint = tickets.get(startpoint);
        }

    }
}
