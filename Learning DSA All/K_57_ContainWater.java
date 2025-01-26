import java.util.ArrayList;



public class K_57_ContainWater {

//<---------------- broute force approach and time complexicity O(n^2) --------------------------->
//     public static int StoreWater(ArrayList<Integer> height){
//         int maxwater =0;
//         for(int i =0; i<height.size();i++){
//             for(int j=i+1; j<height.size();j++){
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j-i;
//                 int water = ht* width;
//                 maxwater = Math.max(maxwater, water);
//             }
//         }
//         return maxwater;
//     }

//<----------------- 2-pointer approach and time complexicity O(n)-------------------------------->
    public static int StoreWater(ArrayList<Integer> height){
        int maxWater =0;
        int rightpointer = height.size()-1 ;
        int leftpointer = 0;
        while(leftpointer < rightpointer){
            int ht = Math.min(height.get(leftpointer), height.get(rightpointer));
            int width = rightpointer-leftpointer;
            int currentwater = width * ht;
            maxWater = Math.max(maxWater, currentwater);
            if(height.get(rightpointer)<height.get(leftpointer)){
                rightpointer--;
            }
            else{
                leftpointer++;
            }
        }

        // for(int i=0; i<height.size();i++){
            // both loop are same you can use anyone loop for solution 
        // }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(9);
        System.out.println("the maimum water is : "+ StoreWater(height));
    }
}
