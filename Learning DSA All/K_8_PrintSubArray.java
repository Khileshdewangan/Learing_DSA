public class K_8_PrintSubArray{

      public static void subArray(int num[]){
        for(int i =0; i < num.length; i++){
            for(int j =i; j < num.length; j++){
                for(int k=i;k<=j; k++){
                     System.out.print(num[k]+" ");   
                }
                System.out.print("\n");
            }
             System.out.print("\n");
        }
    }

    public static void main(String arg[]){
        int num[] ={2,4,6,8,10};
        subArray(num);
    }
}