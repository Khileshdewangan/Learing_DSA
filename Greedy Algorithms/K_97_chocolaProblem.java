import java.util.Arrays;
import java.util.Collections;

public class K_97_chocolaProblem {
    public static void main(String[] args) {
        // int n=4, m = 6;
        Integer costvert[] = { 2, 1, 3, 1, 4 };
        Integer costhori[] = { 4, 1, 2 };
        Arrays.sort(costvert, Collections.reverseOrder());
        Arrays.sort(costhori, Collections.reverseOrder());

        // for(int i=0; i< costvert.length;i++){
        //     System.out.println(costvert[i]);
        // }

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costhori.length && v < costvert.length) {
            if (costvert[v] <= costhori[h]) {
                cost += (costhori[h] * vp);
                hp++;
                h++;

            } else {
                cost += (costvert[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costhori.length) {
            cost += (costhori[h] * vp);
            hp++;
            h++;
        }
        while (v < costvert.length) {
            cost += (costvert[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost of cuts = " + cost);
    }
}
