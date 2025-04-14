package java_basics.methods;

public class Methods_2_overloading {

    static int add(int a, int b) {
        System.out.println("called int add fun");
        return a + b;
    }

    static float add(float a, float b) {
        System.out.println("called float add fun");
        return a + b;
    }

    static double add(double a, double b) {
        System.out.println("called double add fun");
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(add(10.2f, 16.f));
        System.out.println(add(45.4d, 12.4d));
        System.out.println(add(1, 14.3));
    }
}
