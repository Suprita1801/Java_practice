// Area of Triangle
package Basics;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter the lenght of the triangle :");
        double length = num.nextDouble();

        System.out.println("Enter the base of the triangle :");
        double base = num.nextDouble();

        double area = 0.5*length*base;

        System.out.println("The area of the triangle is : " + area);
    }
    
}
