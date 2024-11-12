import java.util.ArrayList;

public class K_66_BeautifulArrayList {
    public static ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while (ans.size() < n ) {
            ArrayList<Integer> temp = new ArrayList<>();
            int ans_size = ans.size();
            for(int i=0 ; i<ans_size; i++){
                if(ans.get(i)*2-1 <= n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0 ; i<ans_size; i++){
                if(ans.get(i)*2 <= n){
                    temp.add(ans.get(i)*2);
                }
            }
             ans = temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = beautifulArray(6);
        // int ans = list.size();
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
