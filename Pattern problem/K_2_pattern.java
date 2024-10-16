public class K_2_pattern{
    public static void hollo_pattern(int totrow, int totcolm){
        //outer loop
        for(int i=1; i<=totrow; i++){
            //inner loop
            for(int j=1; j<=totcolm; j++){
                if(i == 1 || i == totrow || j == 1 || j == totcolm){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }   
            }
                 System.out.println(); 

        }
    }

    public static void inverted_rotated_half(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
                }

            for(int j=1; j<=i; j++){
                System.out.print("*");
                }
                  
                 System.out.println(); 
            }

        }

       
    public static void inverted_half_pyramid(int n){
        for (int i =1; i <= n; i++){
            for(int j=1 ; j<=n-i+1;j++){
                System.out.print(" "+j);
            }
                System.out.println();
        }
    }

    public static void floyd_tringle(int n){
            int count=1;
        for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.print("\n");
        }
    }


    public static void tringle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){
        for (int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void solid_rombis(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
             System.out.print("\n");
        }
    }


    static void holow_rhombus(int n){
        for(int i=1;i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void diamond_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        diamond_pattern(5);
    }


    

    // public static void main(String arg[]){
    //     hollo_pattern(10,7);
    //     inverted_rotated_half(4);
    //     inverted_half_pyramid(5);
    //     floyd_tringle(5);
    //     tringle(5);
    //     butterfly(10);
    //     solid_rombis(5);
    //     holow_rhombus(10);
    //     diamond_pattern(15);
    // }
    
}