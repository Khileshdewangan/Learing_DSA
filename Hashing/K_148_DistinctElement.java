import java.util.HashSet;

public class K_148_DistinctElement {
    public static void main(String[] args) {
        int []arr = {4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            map.add(arr[i]);
        }
        System.out.println(" unique elements is => " + map.size());
    }
}
