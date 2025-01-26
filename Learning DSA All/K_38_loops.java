import java.util.*;

public class K_38_loops{
    public static void main(String arg[]){

        Scanner scan =new Scanner(System.in);
        System.out.print("enter the number : ");
        int num=scan.nextInt();
        
        // int sum =0;
        // int k=1;
        // while(k<=num){
        //     sum=sum+k;
        //     k++;
        // }
        // System.out.println(sum);
        // System.out.print("\n");

        char ch='A';
        for (int i =1;i<=num;i++)
        {
            for(int j=1;j<=i;j++ )
            {
                System.out.print(ch);
                ch++;
            }
                System.out.print("\n");
        }
        scan.close();
    }
}