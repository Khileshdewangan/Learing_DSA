import java.util.Arrays;
import java.util.Comparator;

public class K_92_fractionalKnapsack {
    public static void main(String[] args) {
        int[] value = {60,100,120};
        int weight[] = {10,20,30};
        int W= 50;

        double ratio[][] = new double[value.length][2];
        for(int i=0; i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }{
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int capacity = W;
        int finalVal = 0;
        for(int i= value.length-1; i>= 0;i--){
            int indx = (int)ratio[i][0];
            if(capacity >= weight[indx]){
                finalVal += value[indx];
                capacity -= weight[indx];
            }else{
                finalVal += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalVal);
    }
}
}