public class K_51_RateMaze {
    public static void pathfind(int matrix[][], int row, int col, int n, boolean [][]visited, String psf){
       
        if(row<0 || col<0 || row >= n || col >= n){
            return;
        }

        if(matrix[row][col] == 0 || visited[row][col] == true){
            return;
        }
        if(row == n-1 && col == n-1){
            System.out.println("destination reached    "+psf);
            return;
        }

        visited[row][col] = true;

        pathfind(matrix, row-1, col, n, visited , psf+"U");    //UP
        pathfind(matrix, row+1, col, n, visited , psf+"D");   //DOWN
        pathfind(matrix, row, col-1, n, visited , psf+"L");  //LEFT
        pathfind(matrix, row, col+1, n, visited , psf+"R"); //RIGHT

        visited[row][col] = false;

    }
    public static void main(String[] args) {
        int n= 4;
        int matrix[][] = {{1,1,1,1},{0,1,0,1},{1,1,1,1},{1,0,1,1}};
        boolean visited[][] = new boolean[n][n];
        pathfind(matrix,0,0,n, visited, "");
    }
}
