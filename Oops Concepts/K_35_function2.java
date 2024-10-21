public class K_35_function2{
    public static boolean isPrime(int a){
        if(a==2){
            return true;
        }
        for(int i = 2; i<=a-1; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void rangePrime(int x){
        for(int i=2; i<= x; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            // System.out.print(" ");
        }
    }
    public static void main(String arg[]){
        // System.out.println(isPrime(39));
        rangePrime(100);
    }
}