public class K_52_KnightTour_2 {
    static int dr[] = {2, 1, -1, -2, -2, -1, 1, 2};
    static int dc[] = {1, 2, 2, 1, -1, -2, -2, -1};

    public static boolean knightTour(int row, int col, int moveNumber, int chess[][]){
        
        
        if(moveNumber == 64){
            for(int r=0; r<8; r++){
                for(int c=0; c<8; c++){
                    System.out.print(chess[r][c]+" ");
                }
                System.out.println();
            }
            return true;
        }
        // base Case
        if(row < 0 || col < 0 || row >= 8 || col >= 8){
            return false;
        }
        if(chess[row][col] != -1){
            return false;
        }


        chess[row][col] = moveNumber;
        for(int i = 0 ; i<8; i++){
            int newrow = row + dr[i];
            int newcol = col + dc[i];

            boolean result = knightTour(newrow, newcol, moveNumber+1, chess);
            if(result == true){
                return result;
            }
        }
        chess[row][col] = -1;
        return false;
    }
    public static void main(String[] args) {
        int n=8;
        int chess [][] = new int[n][n];
        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
             chess[r][c] = -1;
            }
        }
        knightTour(0, 0, 0, chess);
    }
}
