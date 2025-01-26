public class K_36_RecursionBasic {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }


    public static void printinc(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printinc(n - 1);
        System.out.println(n + " ");
    }


   

    public static int factorial(int n) {
        if (n == 0) {
            // System.out.println(1);
            return 1;
        }
        int fac = n * factorial(n - 1);
        return fac;
    }



    public static int NaturalSum(int n) {
        if (n == 1) {
            // System.out.println(1);
            return 1;
        }
        int sum = n + NaturalSum(n - 1);
        return sum;
    }

    


    public static int fibonacci(int n){
        if(n==0 ||n==1){
            return n;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }


    public static void main(String[] args) {
        // int n = 10;
        // printinc(n);
        System.out.println(NaturalSum(10));
        System.out.println(factorial(22));
        System.out.println(factorial(23));
        System.out.println(factorial(24));
        System.out.println(factorial(25));
        System.out.println(factorial(26));
    }
}