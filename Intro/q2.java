// Take name as input and print a greeting message for that particular name.
package Intro;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String yourName = name.next();

        System.out.println("Hello, " + yourName + "!");


    }
}