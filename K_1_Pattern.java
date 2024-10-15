import java.util.*;


public class K_1_Pattern{
     public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = scan.nextInt();
        char ch= 'A';
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        scan.close();
    }
}



//   public static void main(String arg[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int num = scan.nextInt();
//         for(int i=1; i<=num; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }



//  public static void main(String arg[]){
//     Scanner scan = new Scanner(System.in);
//     System.out.print("enter the number : ");
//     int num = scan.nextInt();
//     for(int i=1; i<=num; i++){
//         for(int j=1; j<=num-i+1; j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }



//   public static void main(String arg[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int num = scan.nextInt();
//         for(int i=1; i<=num; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }


