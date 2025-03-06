package Intro;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the value of number1 : ");
        int num1 = num.nextInt();

        System.out.println("Enter the value of number2 : ");
        int num2 = num.nextInt();

        if(num1 > num2){
            System.out.println("The largedt number is number1 : " + num1);
        }
        else if(num2 > num1){
            System.out.println("The largest number is number2 : " + num2);
        }
        else{
            System.out.println("Both the numbers are equal !! ");
        }
    }
}
