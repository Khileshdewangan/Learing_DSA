import java.util.HashMap;

public class K_144_ValidAnagram {

    public static boolean anagram(String S1, String S2){
        if(S1.length() != S2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<S1.length(); i++ ){
            char ch = S1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(int i=0; i<S2.length(); i++){
            char ch = S2.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String S1 = "khilesh";
        String S2 = "heslihk";

        System.out.println(anagram(S1,S2));
    }
}
