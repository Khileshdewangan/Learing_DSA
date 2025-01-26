public class K_46_BacktrakingChangeArray {
    public static void changeArray(int arr[], int i, int val) {
        if (i == arr.length) {
            printarra(arr);
            return;
        }
        arr[i] = val;
        changeArray(arr, i + 1, val + 1);
        arr[i] = arr[i] - 5;

    }

    public static void printarra(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        int arr[] = new int[15];
        changeArray(arr, 0, 1);
        printarra(arr);
    }
}
