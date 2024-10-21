public class k_34_Oops {
    // constructor
    public static void main(String arg[]) {
        Student s1 = new Student();
        s1.name = "khilesh";
        s1.rollno = 25;
        s1.password = "xyz@12";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "abc@121";
        s1.rollno = 205;
        s1.marks[2]=100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.rollno);
        // Student s2 = new Student("khilesh");
        // Student s3 = new Student(21);
        // Student s4 = new Student("khilesh",21);
        
    }
}

class Student {
    int rollno;
    String name;
    String password;
    int marks[];
    
    // shallow copy constructor
    // Student(Student s1) {
    //     this.rollno = s1.rollno;
    //     this.name = s1.name;
    //     this.marks = s1.marks;
    // }


    // deep copy constructor
    Student(Student s1) {
        this.rollno = s1.rollno;
        this.name = s1.name;
        // this.marks = s1.marks;
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
    }
    Student() {
        marks = new int[3];
        System.out.println("Constructo is called........");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.rollno = roll;
    }

    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.rollno = roll;
    }

}