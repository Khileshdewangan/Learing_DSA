import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class K_91_ActivitySelection {
    public static void main(String[] args) {
        int[] start = { 0, 1, 3, 5, 5, 8 };
        int[] end = { 6, 2, 4, 7, 9, 9 };
        // int [] start = {1,3,0,5,8,5};
        // int [] end = {2,4,6,7,9,9};
        // end time basis sorting
        int activies[][] = new int[end.length][3];
        for (int i = 0; i < end.length; i++) {
            activies[i][0] = i;
            activies[i][1] = start[i];
            activies[i][2] = end[i];
        }

        Arrays.sort(activies, Comparator.comparingDouble(o -> o[2]));

        for(int i=0; i<activies.length;i++){
            for(int j= 0;j<activies[0].length;j++){
                System.out.print(activies[i][j]+" ");
            }
            System.out.println();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;

        // firest Activity
        ans.add(activies[0][0]);//ans.add(0);
        maxAct = 1;
        int lastend = activies[0][2]; // end[0];

        for (int i = 1; i < end.length; i++) {
            if (activies[i][1] >= lastend) {
                maxAct++;
                ans.add(activies[i][0]);
                lastend = activies[i][2];
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }
        System.out.println("maximum Activity = " + maxAct);
    }
}
