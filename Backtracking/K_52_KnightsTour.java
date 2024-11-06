 import java.util.Scanner;

public class K_52_KnightsTour {
    public static void knight(int n,int [][] matrix, int row, int col, int movenumber){
        
        if(row<0 || col<0 || row>= n || col>= n){
            return ;
        }

        if(matrix[row][col] != 0){
            return;
        }

        matrix[row][col] = movenumber;

        if(movenumber == n*n-1 ){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        knight(n, matrix, row-2,col+1,movenumber+1);
        knight(n, matrix, row-1,col+2,movenumber+1);
        knight(n, matrix, row+1,col+2,movenumber+1);
        knight(n, matrix, row+2,col+1,movenumber+1);
        knight(n, matrix, row+2,col-1,movenumber+1);
        knight(n, matrix, row+1,col-2,movenumber+1);
        knight(n, matrix, row-1,col-2,movenumber+1);
        knight(n, matrix, row-2,col-1,movenumber+1);
        matrix[row][col] = 0;

    }
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no. of knight size : ");
        int n= sc.nextInt();
        knight(n,new int[n][n], 0,0,0);
    }
}
