import java.util.HashMap;

public class K_151_LargestSubarray0Sum {
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer, Integer> map = new HashMap<>();//(sum,idx)
        int sum =0; 
        int length = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                length = Math.max(length, i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        System.out.println("largest subarray with 0 sum : " + length);
    }
}
