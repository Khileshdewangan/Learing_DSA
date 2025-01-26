import java.util.HashSet;

public class K_149_UnionandIntersection {
    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        //Union
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            map.add(arr[i]);
        }
        for(int i=0; i<arr2.length; i++){
            map.add(arr2[i]);
        }

        System.out.println("Union is => "+ map.size());

        //intersection
        map.clear();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            map.add(arr[i]);
        }

        for(int j=0; j<arr2.length; j++){
            if(map.contains(arr2[j])){
                count++;
                map.remove(arr2[j]);
            }
        }

        System.out.println("intersetion is => " + count);
    }
}
