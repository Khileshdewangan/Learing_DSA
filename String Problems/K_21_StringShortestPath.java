public class K_21_StringShortestPath {

    public static float getPath(String str){
        int x=0;
        int y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);

            if(dir =='s'){
                y--;
            }
            else if(dir =='n'){
                y++;
            }
            else if(dir =='w'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String arg[]){
            String str = "wneenesennn";
            System.out.println(getPath(str));
        }
}
