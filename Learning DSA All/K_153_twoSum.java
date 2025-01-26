import java.util.HashMap;

public class K_153_twoSum {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            }
            map.put(arr[i], i);
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 7, 11, 15 };
        int arr[] = { 2, 3, 7, 8, 1, 9, 6, 20, 5, 22 };
        int target = 9;
        int ar[] = twoSum(arr, target);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
