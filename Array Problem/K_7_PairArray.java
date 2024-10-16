public class K_7_PairArray{
    public static void pairArray(int num[]){
        int no=0;
        for(int i =0; i < num.length; i++){
            int curr=num[i];
            for(int j =i+1; j < num.length; j++){
                System.out.print("("+curr+","+ num[j]+") ");
                no++;
            }
             System.out.print("\n");
        }
        System.out.print("no. of pairs is : "+no);
    }

    public static void main(String arg[]){
        int num[] ={2,4,6,8,10};
        pairArray(num);
    }
}