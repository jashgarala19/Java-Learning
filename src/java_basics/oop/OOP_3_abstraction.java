package java_basics.oop;


abstract class Test {

    abstract void run(); // abstract method // no body

    // can have no abstract methods
    void otherMethod() {
        System.out.println("Test other method");
    }
}


public class OOP_3_abstraction extends Test {

    // method implemented in Sub Class
    @Override
    void run() {
        System.out.println("Running....... ");
    }


    public static void main(String[] args) {
        OOP_3_abstraction obj = new OOP_3_abstraction();

        // class which is abstract cannot be initiated
        //        Test obj2 = new Test();
        obj.otherMethod();
        obj.run();
    }

}
