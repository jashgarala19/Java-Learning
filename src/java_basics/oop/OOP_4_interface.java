package java_basics.oop;


//// 100% Abstraction

// Method is by default abstract and public
interface Animal {

    /// Attributes are by default public , static and final
    int Number = 10;

    public void sound();

    public void eat();
}


interface Car {
    void start();
}

public class OOP_4_interface implements Animal, Car {
    public static void main(String[] args) {


    }

    @Override
    public void sound() {
        System.out.println("Sound.......");
    }

    @Override
    public void eat() {
        System.out.println("Eat..........");
    }

    @Override
    public void start() {
        System.out.println("Car Start.......");
    }
}
