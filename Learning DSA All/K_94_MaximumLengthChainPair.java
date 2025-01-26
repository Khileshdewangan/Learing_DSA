import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class K_94_MaximumLengthChainPair {
    public static void main(String[] args) {
        int [][] pair = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair, Comparator.comparingDouble(o->o[1]));
        ArrayList<Integer> ans = new ArrayList<>();
        int chainLen = 1;
        int chainEnd = pair[0][1];
        ans.add(0);
        
        for(int i=0; i<pair.length;i++){
            if(pair[i][0] > chainEnd){
                chainLen++;
                chainEnd = pair[i][1];
                ans.add(i);
            }
        }
        System.out.println("maximum length chain of pair is : " + chainLen);
        
        for(int i=0; i<ans.size();i++){
            System.out.print( ans.get(i) + " ");
        }
    }
}