package java_basics.methods;

public class Methods_1 {

    static void printHelloWorld() {
        System.out.println("Hello World");
    }

    void testMethod() {
        System.out.println("Print Test Method");
    }

    public static void main(String[] args) {
        Methods_1 m = new Methods_1();
        m.testMethod();

        printHelloWorld(); //static method can be called directly

    }
}
