public class K_49_GridWays {
    public static int gridWays(int row, int col, int n,int m){
        //base case
        if(row == n-1 && col == n-1){// last cell condition
            return 1;
        }else if(row==n || col == m){ //boundary cross condition
            return 0;
        }
        int way1= gridWays(row+1,col,n,m);
        int way2= gridWays(row,col+1,n,m);
        return way1+way2;
    }
    public static void main(String[] args) {
        int n=4,m=4;
        System.out.println("total no. of ways : " + gridWays(0,0,n,m));
    }
}
