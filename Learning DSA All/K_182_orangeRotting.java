import java.util.LinkedList;
import java.util.Queue;

public class K_182_orangeRotting {
    public static int ornageRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int freshOrange = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    freshOrange++;
                } else if (grid[i][j] == 2) {
                    q.add(i * m + j);
                }
            }
        }

        int level = 0;
        int[][] direction = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

        if (freshOrange == 0) {
            return 0;
        }

        while (q.size() > 0) {
            int size = q.size();
            while (size > 0) {
                int rottenOrange = q.remove();

                int i = rottenOrange / m;
                int j = rottenOrange % m;
                for (int[] temp_direc : direction) {
                    int new_row = i + temp_direc[0];
                    int new_col = j + temp_direc[1];

                    if (new_row >= 0 && new_col >= 0 && new_row < n && new_col < m && grid[new_row][new_col] == 1) {
                        grid[new_row][new_col] = 2;
                        freshOrange--;
                        q.add(new_row * m + new_col);
                    }
                }
                size--;
            }
            level++;
        }
        if (freshOrange == 0) {
            return level - 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        System.out.println(ornageRotting(grid));
    }
}
