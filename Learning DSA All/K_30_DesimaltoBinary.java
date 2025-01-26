public class K_30_DesimaltoBinary{
    public static void fun(int a){
        int pow=0;
        int dec=0;

        while(a>0){
            int Lastdigit= a%10;
            dec = dec + (Lastdigit * (int)Math.pow(2,pow));
            pow++;
            a=a/10;
        }
        System.out.print("desimial of "+a +" is : "+ dec);
    }

    public static void fun2(int n){
            int pow=0;
            int binnum=0;

            while(n>0){
                int rem=n%2;
                binnum =binnum + (rem *(int) Math.pow(10,pow));
                pow++;
                n=n/2;
            }
            System.out.println("desimial of "+ n +" is : "+ binnum);
    }
    public static void main(String arg[]){
        fun2(15);
    }
}