// File: ControlFlowDemo.java



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

    }


    public static boolean checkPalindrome(String str) {
        System.out.println("");
        String reversed = "";
        for (int s = str.length() - 1; s >= 0; s--) {
            reversed += str.charAt(s);
        }

        String r = reversed.toLowerCase();
        return r.equals(str.toLowerCase());
    }
}
