// import java.util.*;
public class K_35_function{
    
    public static int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }

    public static int bincoff(int n,int r){
        int nfac=factorial(n);
        int rfac=factorial(r);
        int nmrfac=factorial(n-r);
        int bincoffi = nfac/(rfac*nmrfac);
        return bincoffi;
    }

    public static void main(String arg[]){
        // int prod= factorial(6);
        int prod= bincoff(5,3);
        System.out.print("binomial cofficient : "+prod);
    }
}


        // int prod= multiply(5,15);
// public static int multiply(int a, int b){
//         int pro=a*b;
//         return pro;
//     }


// <---------------------------------------------------------------->
//     public static void swap(int x,int y){
//         int temp = x;
//         x= y;
//         y = temp;
  

//     }

// public static void main(String arg[]){
//     int a=5;
//     int b=10;

//    swap(a,b);
//      System.out.println("a is :" + a);
//     System.out.println("b is :" + b);

// }



// <------------------------------------------------------------------->
    // public static int calSum(int n1,int n2){
    //     int sum =n1+n2;
    //     return sum;
    // }

    // public static void main(String arg[]){
    //     Scanner scan =new Scanner(System.in);
    //     int a = scan.nextInt();
    //     int b = scan.nextInt();
    //     int sum = calSum(a,b);
    //     System.out.print("sum is : "+sum);
    // }
