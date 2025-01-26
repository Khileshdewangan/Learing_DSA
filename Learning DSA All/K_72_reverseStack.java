import java.util.Stack;

public class K_72_reverseStack {
     public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    public static void reverseString(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseString(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(25);
        s.push(125);
        s.push(2);
        s.push(3);
        // printStack(s);
        System.out.println(s);

        System.out.println("<----------after reverse stack------------>");
        reverseString(s);
        System.out.println(s);

    }
}
