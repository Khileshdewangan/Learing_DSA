import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class K_95_IndianCOin {
    public static void main(String[] args) {
        Integer[] coin = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 590;
        Arrays.sort(coin , Comparator.reverseOrder());
        int countofCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<coin.length;i++){
            if(coin[i] <= amount){
                while (coin[i] <= amount) {
                    countofCoins++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                }
            }
        }
        System.out.println("total minimum coin used = " + countofCoins);
        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }

    }
}
