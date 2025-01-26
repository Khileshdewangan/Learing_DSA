// import java.util.*;
public class K_3_array {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 10;
        }
    }

    public static void main(String arg[]) {
        int marks[] = { 25, 56, 85 };

        // Scanner scan = new Scanner(System.in);

        // marks[0] = scan.nextInt();
        // marks[1] = scan.nextInt();
        // marks[2] = scan.nextInt();

        // System.out.println("score of maths is : " + marks[0]);
        // System.out.println("score of physics is : " + marks[1]);
        // System.out.println("score of chemistry is : " + marks[2]);

        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("score of student " + (i + 1) + " is : " + marks[i]);
        }

        // marks[2]=100;
        // System.out.println("score of chemistry is : " + marks[2]);

    }
}