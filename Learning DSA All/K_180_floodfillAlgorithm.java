public class K_180_floodfillAlgorithm {

    public static void helper(int[][] image, int sr, int sc, int col, boolean[][] vis, int oricol){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || vis[sr][sc] || image[sr][sc] != oricol){
            return;
        }
        image[sr][sc]=col;
        //left
        helper(image, sr, sc-1, col, vis, oricol);
        //right
        helper(image, sr, sc+1, col, vis, oricol);
        //up
        helper(image, sr-1, sc, col, vis, oricol);
        //down
        helper(image, sr+1, sc, col, vis, oricol);
    }

    public static int[][] floodfill(int [][] image, int sr, int sc, int col){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, col, vis, image[sr][sc]);
        return image;
    }
    
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1,sc=1,col=2;
        int [][] x = floodfill(image, sr, sc, col);


        for(int i=0;i<x.length;i++){
            for(int j=0; j<x[0].length; j++){
                System.out.print(x[i][j] +" ");
            }
        System.out.println();
      }
    }
}
