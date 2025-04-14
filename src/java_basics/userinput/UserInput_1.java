package java_basics.userinput;

import java.util.Scanner;

public class UserInput_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name: ");
        String s = sc.nextLine();


        System.out.print("What is your Age: ");
        int age = sc.nextInt();


        System.out.println(s);
        System.out.println(age);
    }
}
