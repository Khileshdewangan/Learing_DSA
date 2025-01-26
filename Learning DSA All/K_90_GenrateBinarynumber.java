import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class K_90_GenrateBinarynumber {
    public static ArrayList<String> genrateNumber(int n){
        ArrayList<String> str = new ArrayList<>();
        Queue<String> q= new LinkedList<>();

        q.add("1");
        
        while(n-- > 0){
            String s = q.peek();
            str.add(s);
            q.add(s+"0");
            q.add(s+"1");
            q.remove();
        }
        return str ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer Number Please");
        int n= sc.nextInt();
        // int n = 6;
        System.out.println(genrateNumber(n));
    }
}
