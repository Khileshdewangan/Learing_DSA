import java.util.*;

public class K_54_ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(20);

        System.out.println(list);
        // System.out.println("size of Array:  "+list.size());
        
        // System.out.println("Arrays list:  ");
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();


        // System.out.println("Reverse Arrays list:  ");
        // for(int i = list.size()-1;i >= 0;i--){
        //     System.out.print(list.get(i)+" ");
        // }


        //for Asending Order
        Collections.sort(list);
        System.out.print(list);


        //for Decending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);

        
    }
}
