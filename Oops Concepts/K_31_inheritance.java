public class K_31_inheritance {
    public static void main(String arg[]) {
        // fish f1 =new fish();
        // f1.eats();

        Dog d1 = new Dog();
        d1.color = "red";
        d1.lages = 4;
        d1.roll = 10001;
        System.out.println(d1.color);
        System.out.println(d1.lages);
        System.out.println(d1.roll);
        d1.eats();
    }
}

class Animal {
    String color;
    int lages;

    void eats() {
        System.out.println("you in base class");
    }
    void show() {
        System.out.println("show method");
    }
}
class Mammal extends Animal {
    int roll;

}

class Dog extends Mammal {
    int birds;

}

// class fish extends animal {
// void kuch() {

// System.out.println("kuch method");
// }
// }