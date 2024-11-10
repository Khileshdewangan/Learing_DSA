import java.util.ArrayList;

public class K_55_ArrayListQuestions {
    public static int maxele(ArrayList<Integer> list ){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
    return max;
    }

    public static void swap(ArrayList<Integer> list , int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2,temp);

      }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(58);
        list.add(24);
        list.add(12);
        list.add(95);
        list.add(36);

        // System.out.println("Maximum is :  "+maxele(list));
        System.out.println(list);
        swap(list,1,3);
        System.out.println(list);

    }
}