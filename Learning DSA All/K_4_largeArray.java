public class K_4_largeArray{

    public static int largeNum(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i < num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }

    public static int smallNum(int num[]){
        int small = Integer.MAX_VALUE;
        for(int i=0; i < num.length; i++){
            if(small > num[i]){
                small = num[i];
            }
        }
        return small;
    }
    public static void main(String arg[]){
        int num[] = {4,5,2,1,7,0,8,55,9,3,1};
        System.out.println(" large number is : "+ largeNum(num));
        System.out.println(" small number is : "+ smallNum(num));
    }
}