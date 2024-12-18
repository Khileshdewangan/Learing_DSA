import java.util.HashMap;
import java.util.TreeMap;

public class K_154_freqCharSort {
    public static String freqSort(String str){
        //step-1
        HashMap <Character, Integer> chartofreq = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int freq = chartofreq.getOrDefault(ch,0)+1;
            chartofreq.put(ch, freq);
        }

        //step-2
        TreeMap <Integer, String> freqtochar = new TreeMap<>();
        for(char ch : chartofreq.keySet()){
            int freq = chartofreq.get(ch);
            String value = freqtochar.getOrDefault(freq, "");
            freqtochar.put(freq, ch+value);
        }

        // step 3
        StringBuilder res = new StringBuilder();
        for(int i = str.length(); i>0; i--){
            String value = freqtochar.getOrDefault(i, "");
            for(char ch : value.toCharArray()){
                res.append(("" + ch).repeat(i));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "abddcedcbabcc";

        String str2 = freqSort(str);
        for(int i=0; i<str2.length(); i++){
            // char ch = str2.charAt(i);
            System.out.print(str2.charAt(i));
        }
    }
}
