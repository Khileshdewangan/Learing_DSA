public class K_28_BitWiseEvenOdd{
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n&bitmask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
    
        }
    }

    public static void main(String arg[]){
        oddOrEven(2);
        oddOrEven(33);
        oddOrEven(18);
        oddOrEven(25);
    }

}