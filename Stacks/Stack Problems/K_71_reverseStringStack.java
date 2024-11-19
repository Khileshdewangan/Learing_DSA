import java.util.Stack;

public class K_71_reverseStringStack {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int indx = 0;
        while(indx < str.length()){
            s.push(str.charAt(indx));
            indx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "khilesh";
        String result = reverseString(str);
        System.out.println(result);
    }
}
