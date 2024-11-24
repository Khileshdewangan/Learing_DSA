public class K_99_lexicographicallySmallest {
    public static String SmallestString(int n, int k){
        StringBuilder sb = new StringBuilder();
        int total_chars = n;
        int csum =k;
        while(total_chars > 0){
            if((total_chars-1)*26 > csum-1){
                sb.append('a');
                csum--;
            }else{
                int position = csum%26;
                if(position%26 == 0){
                    sb.append('z');
                    csum -= 26;
                }else{
                    sb.append((char)(position-1+'a'));
                    csum -= position;
                }
            }
            total_chars--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int n= 5, k = 101;
        System.out.println(SmallestString(n,k));

    }
}
