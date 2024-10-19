public class K_21_palindrome {
    public static boolean check(String str){
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        String str = "racecar";
        System.out.println(check(str));
    }
    
}
