// import java.util.*;
public class K_15_InsertionSort{
    public static void insertionSort(Integer arr[]){
        for( int i=0; i<arr.length-1; i++){
            int curr = arr[i];
            int preval =i-1;
            while(preval >= 0 && arr[preval] > curr){
                arr[preval+1]=arr[preval];
                preval--;
            }
            //insertion
            arr[preval+1]=curr;
        }
    }

     public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String arg[]){
        Integer arr[] = {2,5,8,4,1,6,3,7};
        insertionSort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}