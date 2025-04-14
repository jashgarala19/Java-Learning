package java_basics.typecasting;

public class TypeCasting {
    public static void main(String[] args) {


        //  Wide Casting
        /// byte -> short -> char -> int -> long -> float -> double

        // Narrow Casting
        ///double -> float -> long -> int -> char -> short -> byte


        //Automatic casting int -> double [Widening is done automatically]
        int a = 10;
        double d = a;
        System.out.println(d);

        char c = 'J';
        double d2 = c;


        System.out.println(d2);


        /// Narrow casting (Manually using () )

        double d3 = 10.5d;
        int g = (int) d3;

        System.out.println(g);


        int f = 65;
        char c2 = (char) f;
        System.out.println(c2);

    }
}
