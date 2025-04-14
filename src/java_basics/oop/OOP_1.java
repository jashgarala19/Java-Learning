package java_basics.oop;


abstract class AB {

    abstract void run();
}

class OOP_1 extends AB {
    public int a;
    /// cannot be modified
    public final float PI = 3.14f;


    void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {

        OOP_1 obj = new OOP_1();

        obj.a = 10;
        OOP_1 obj2 = new OOP_1();
        obj2.a = 20;

        System.out.println(obj.a);
        System.out.println(obj2.a);

    }
}
