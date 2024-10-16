
public class K_5_BinarySearch {
   public K_5_BinarySearch() {
   }

   public static int binarySearch(int[] num, int key) {
      int start = 0;
      int end = num.length - 1;

      while (start <= end) {
         int mid = (start + end) / 2;
         if (num[mid] == key) {
            return mid;
         }

         if (num[mid] < key) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }

      return -1;
   }

   public static void main(String[] var0) {
      int[] num = new int[] { 12, 15, 18, 20, 25, 33, 45, 50, 60 };
      int key = 18;
      int binarySearch = binarySearch(num, key);
      System.out.println(" the index of key is : " + binarySearch);
   }
}
