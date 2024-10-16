public class K_13_BubbleSort{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr.length-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String arg[]){
        int arr[] = {5,8,3,9,4,1,2};
        bubbleSort(arr);
        printArr(arr);
    }
}