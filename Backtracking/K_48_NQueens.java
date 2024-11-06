// import java.util.Scanner;
// all Ways
// no. of solution (count)
// one solution
public class K_48_NQueens {
//    All Ways
    public static boolean isSafe(char[][] board, int row, int col){
        // for verticalup
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // for diagonal left
        for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j] =='Q'){
                return false;
            }
        }
        // for diagonal right
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j] =='Q'){
                return false;
            }
        }
        return true;
    }
    // public static void nQueen(char[][] board, int row){
    //     // base Case
    //     if(row==board.length){
    //         // printBoard(board); //All Ways
    //         count++;  //count no. of solution
    //         return;
    //     }
    //     for(int col=0; col<board.length; col++){
    //         if(isSafe(board,row,col)){
    //             board[row][col]='Q';
    //             nQueen(board, row+1);
    //             board[row][col]='X';
    //         }
    //     }
    // }


    public static boolean nQueen(char[][] board, int row){
        // base Case
        if(row==board.length){
            count++;  
            return true ;
        }
        for(int col=0; col<board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                if(nQueen(board, row+1)){
                     return true ;
                }
                board[row][col]='X';
            }
        }
        return false;
    }



    public static void printBoard(char board[][]){
        System.err.println("----------- Chess Board ------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        // System.out.print("enter chessBoard size :- ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='X';
            }
        }
        // nQueen(board, 0);//all ways
        System.out.println("total no. of way to solve n Queens :- "+ count); //count  
        if(nQueen(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        }else{
            System.out.println("solution is not possible");

        }
    }   
}


