// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

public class K_5_BinarySearch {
   public K_5_BinarySearch() {
   }

   public static int binarySearch(int[] var0, int var1) {
      int var2 = 0;
      int var3 = var0.length - 1;

      while(var2 <= var3) {
         int var4 = (var2 + var3) / 2;
         if (var0[var4] == var1) {
            return var4;
         }

         if (var0[var4] < var1) {
            var2 = var4 + 1;
         } else {
            var3 = var4 - 1;
         }
      }

      return -1;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{12, 15, 18, 20, 25, 33, 45, 50, 60};
      byte var2 = 18;
      PrintStream var10000 = System.out;
      int var10001 = binarySearch(var1, var2);
      var10000.println(" the index of key is : " + var10001);
   }
}
