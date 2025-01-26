import java.util.ArrayList;

public class K_58_PairSum {

    //<-----------------broute force O(n^2)--------------->
    // public static boolean pairSum1(ArrayList<Integer> list , int target){
    //     for(int i=0; i<list.size();i++){
    //         for(int j=0; j<list.size(); j++){
    //             if(list.get(i)+list.get(j)== target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    // <------------------ 2-pointer approachO(n)------------------------------->
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        int leftp =0;
        int rightp=list.size() - 1;
        while(leftp != rightp){
            //Case 1
            if(list.get(leftp)+list.get(rightp)==target){
                return true;
            }
            //Case 2
            else if(list.get(leftp)+list.get(rightp)<target){
                leftp++;
            }
            //Case 3
            else{
                rightp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum1(list,5));
    }
}
