import java.util.Scanner;

public class K_20_Strings{
    public static void main(String [] arg){
        String str ="khilesh";
        String str2 = "khilesh";
        String  str3 = new String("khilesh");
        System.out.println(str.equals(str3));

        // System.out.print(str==str3);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name ");
        String firstname = sc.next();
        System.out.print("enter last tname ");
        String secondname = sc.next();
        System.out.println(firstname.concat(secondname));

        System.out.println(str==str2);
        System.out.println(str==str3);
        
        System.out.println(str.length());

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str.trim());

        System.out.println(str.trim());
        
        // System.out.print(str.charAt(5));
        
        // System.out.print(str.indexOf("ls"));
        sc.close();
    }
}