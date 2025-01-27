public class K_44_QuikSort_DivideConquer1 {

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;

        }

        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1);//left
        quickSort(arr, pidx+1, ei);//right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i  = si-1;

        for(int j= si; j< ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i]=temp;
        return i ;

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int arr[] = {3,5,9,2,8,7};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
