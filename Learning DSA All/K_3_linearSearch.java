public class K_3_linearSearch{
    
    public static int linerSearch(int num[] , int key){
        for(int i = 0; i < num.length; i++){
            if (num[i]==key){
                return i;
            }
        }
                return -1;
    }


    public static void main(String arg[]){
        int num[] ={5,7,1,2,6,1,20,45,55};
        int key = 20;
        int index=linerSearch(num, key);
        if(index==-1){
            System.out.println("not match");
        }
        else{
            System.out.println("key index is : "+ index);
        }

    }

}