package java_basics.arrays;

public class Array_1 {
    public static void main(String[] args) {

        String[] s = {"Jash", "Jeet", "Mango", "Banana"};

        s[2] = "Apple"; //modifying an array

        // For Loop
        for (int i = 0; i <= s.length - 1; i++) {
            System.out.println(s[i]);
        }

        System.out.println("-----------");
        // Using For Each
        for (String element : s) {
            System.out.println(element);
        }
    }
}
