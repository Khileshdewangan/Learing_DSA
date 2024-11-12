import java.util.ArrayList;
import java.util.Scanner;

public class K_64_FrequentlyNumber {
    public static int mostFrequently(ArrayList<Integer> nums , int key){
        int table[] = new int[1001];
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) == key){
                table[nums.get(i+1)]++;
            }
        }
         int target =0;
         int maxindx = 0;
        for(int i=0; i< table.length ;i++){
            if(table[i] > maxindx){
                maxindx = table[i];
                target = i;
            }
        }
        return target;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int key;
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("add in array");
        for(int i=0; i<n;i++){
            nums.add(sc.nextInt());
        }
        System.out.println("Enter key");
        key = sc.nextInt();
        int result = mostFrequently(nums,key);
        System.out.println(result);
        sc.close();
    }
}
