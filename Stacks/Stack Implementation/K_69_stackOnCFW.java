import java.util.Stack;

public class K_69_stackOnCFW {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(25);
        s.push(125);
        s.push(2);
        s.push(3);
        // System.out.println(s);
        while(!s.isEmpty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }
    }
}
