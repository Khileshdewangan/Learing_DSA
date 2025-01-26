public class K_37_RecurstionSort {
    // Question-1
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }

    // Question-2
    public static int firstOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, key, i + 1);
    }

    // Question-3
    public static int lastOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurrence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {

            return i;
        }
        return isfound;
    }

    // Question-4
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // Question-5
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpowr = optimizedPower(a, n / 2);
        int halfpowersqr = halfpowr * halfpowr;
        if(n%2 != 0){
            halfpowersqr= a*halfpowersqr;
        }
        return halfpowersqr;
    }

    // Question-1
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5};
        // System.out.print(isSorted(arr,0));

        int arr2[] = { 8, 3, 6, 9, 6, 10, 2, 8, 5 };
        // System.out.print(firstOccurrence(arr2,5,0));
        // System.out.print(lastOccurrence(arr2,6,0));

        // System.out.print(power(2, 10));
        System.out.print(optimizedPower(2, 6));
    }
}
