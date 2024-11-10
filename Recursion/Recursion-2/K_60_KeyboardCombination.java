public class K_60_KeyboardCombination {
    final static char keyboard[][] = {{},
                                    {},
                                {'a', 'b', 'c'},
                                {'d', 'e', 'f'},
                                {'g', 'h', 'i'},
                                {'j', 'k', 'l'},
                                {'m', 'n', 'o'},
                                {'p', 'q', 'r', 's'},
                                {'t', 'u', 'v'},
                                {'w', 'x', 'y', 'z'},};

    public static void lettercombination(String givenString){
        int n = givenString.length();
        if(n==0){
            System.out.println("null");
            return;
        }

        recursive_fun(0, n, "", givenString);
    }

    public static void recursive_fun(int pos, int len, String outpuString, String givenString){
        if(pos == len){
            System.out.println(outpuString);
        }
        else{
            char[] letter = keyboard [givenString.charAt(pos)-'0'];
            for(int i=0; i<letter.length;i++){
                recursive_fun(pos+1, len, outpuString+letter[i], givenString);
            }
        }
    }
    public static void main(String[] args) {
        lettercombination("23");
        
    }
}
