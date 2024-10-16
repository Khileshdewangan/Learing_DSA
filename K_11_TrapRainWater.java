public class K_11_TrapRainWater{
    public static int trapWater(int height[]){

        int leftMax[] = new int [height.length]; 
        leftMax[0]=height[0];
        for(int i = 1; i<height.length; i++){
            leftMax[i]= Math.max( height[i], leftMax[i-1] );
        }

        int rightMax[] = new int [height.length]; 
        rightMax[height.length-1]=height[height.length-1];
         for(int i = height.length-2; i>=0; i--){
            rightMax[i]= Math.max( height[i] ,rightMax[i+1]);
        }


        int traprainwater = 0;

        for(int i =0; i<height.length; i++){
        int waterLevel = Math.min(rightMax[i], leftMax[i]);
        traprainwater += waterLevel - height[i];
        }
        return traprainwater;  

    }
    public static void main(String arg[]){
        int height[] = {4,2,0,3,2,5};
        // int height[] = {4,2,0,3,2,5};
        // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int height[] = {4,2,0,6,3,2,5};
        System.out.print(trapWater(height));
    }
}