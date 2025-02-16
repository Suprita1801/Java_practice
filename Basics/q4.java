package Basics;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter the value of Diagonla_1 : ");
        double d1 = num.nextDouble();

        System.out.println("Enter the value of Diagonal_2 : ");
        double d2 = num.nextDouble();

        double area = 0.5 * d1 * d2;

        System.out.println("The area of rhombus is " + area);
        
    }
    
}
