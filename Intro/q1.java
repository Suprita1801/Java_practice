package Intro;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int N = num.nextInt();

        if(N%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
