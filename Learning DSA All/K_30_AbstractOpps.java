public class K_30_AbstractOpps {
    
    public static void main(String arg[]) {
        // Horse h =new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        
        // chicken c = new chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color);

        // Animal a= new Animal();
        // we cannot create object for abstract class


        Mastang m1 =new Mastang();
    }
}

abstract class Animal {
    String color;
    Animal (){
        // color="brown";
        System.out.println("animal class called....................!!!!!!!!");
    }
    void eat() {
        System.out.println("animal class");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse class called....................!!!!!!!!");
    }
    void walk() {
        System.out.println("horse class");
    }
}

class Mastang extends Horse{
    Mastang(){

        System.out.println("mastang class called....................!!!!!!!!");
    }
}

class chicken extends Animal{
    void walk() {
        System.out.println("chiken class");
    }
}
