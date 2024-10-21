public class K_32_Polymorphism {
    public static void main(String arg[]) {
        calculator calc = new calculator();
       System.out.println( calc.sum(5, 6));
       System.out.println( calc.sum((float)5.5, (float)6.6));
       System.out.println( calc.sum(5, 6,11));

       animal d=new animal();
       d.eat();
    }
}    

class animal{
    void eat(){
        System.out.println("animal class");
    }
}
class dear extends animal{
    void eat(){
        System.out.println("dear class (derived)");
    }
}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}