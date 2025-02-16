// Area of Circle
package Basics;

import java.util.Scanner;

class q1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");
        double radius = num.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is : " + area);
        
    }
}
