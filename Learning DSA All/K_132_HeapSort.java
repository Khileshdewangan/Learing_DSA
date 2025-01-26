public class K_132_HeapSort {
    public static void heapSort(int arr[]){
        //build max heap
        int n = arr.length;
        for(int i = n/2; i>=0; i--){
            heapify(arr,i,n);
        }

        // push largest element at end
        for(int i = n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }

    private static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;

        if(left < size && arr[left] > arr[minIdx]){
            minIdx = left;
        }
        if(right < size && arr[right] > arr[minIdx]){
            minIdx = right;
        }

        if(minIdx != i){
            //swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr,minIdx, size);
        }
    
    }
    public static void main(String[] args) {
        int arr[] ={5,8,2,7,3,9,6};
        heapSort(arr);
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
