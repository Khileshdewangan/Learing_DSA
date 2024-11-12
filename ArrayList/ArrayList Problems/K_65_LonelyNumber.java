import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class K_65_LonelyNumber {

    public static ArrayList<Integer> lonenlyNumber(ArrayList<Integer> nums){
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(nums);
        int n= nums.size();
        for(int i=0; i<n;i++){
            if(i != 0 && (nums.get(i-1) == (nums.get(i)-1) || nums.get(i-1) == nums.get(i))){
                continue;
            }
            if(i != n-1 && (nums.get(i+1) == (nums.get(i)+1) || nums.get(i+1) == nums.get(i))){
                continue;
            }
            result.add(nums.get(i));
        }
        return result ;
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("add in array");
        for(int i=0; i<n;i++){
            nums.add(sc.nextInt());
        }
        ArrayList<Integer> lonelynumbers = new ArrayList<>();
        lonelynumbers = lonenlyNumber(nums);
        for(int i=0; i<lonelynumbers.size();i++){
            System.out.print(lonelynumbers.get(i)+" ");
        }
        sc.close();
    }
}
