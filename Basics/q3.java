//  Area of rectangle
 package Basics;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle : ");
        double length = num.nextDouble();   

        System.out.println("Enter the breadth of the rectangle : ");
        double breadth = num.nextDouble();

        double area = length * breadth;

        System.out.println("The area of the rectangle is :" + area);
        
    }
    
}
