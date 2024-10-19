public class K_22_SubString{
    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] arg){
        String str = "hell world";
        // System.out.println(subString(str, 0, 7));
        System.out.println(str.substring(0,7));

    }

}