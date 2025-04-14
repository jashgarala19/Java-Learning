package java_basics.oop;

public class OOP_2_innerclass {
    int x = 20;

    public class Inner {
        int y = 10;
    }

    public static void main(String[] args) {
        OOP_2_innerclass outer = new OOP_2_innerclass();
        OOP_2_innerclass.Inner inner = outer.new Inner();
        System.out.println(outer.x + inner.y);
    }
}
