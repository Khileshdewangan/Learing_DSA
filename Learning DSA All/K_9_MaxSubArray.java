public class K_9_MaxSubArray
{
    public static void maxSubarraySum(int num[]){

        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i< num.length; i++){
            int start = i;
            for(int j = i;j<num.length; j++){
                int end =j;
                currsum=0;
                for (int k = start; k <= end; k++){
                    currsum += num[k];
                    }
                System.out.print(currsum+" ");
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
            System.out.println();
        }
         System.out.println("max sum is : " + maxSum);
    }
    public static void main(String arg[]){
        int num[]= {2,4,6,8,10};
        // int num[]= {1,-2,6,-1,3};
        maxSubarraySum(num);

    }
}