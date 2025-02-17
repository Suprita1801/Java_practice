// Perimeter of circle
package Basics;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: "); 
        double radius = num.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter of the circle is : " + perimeter);
        

    }
}
