// Area of circle , triangle , parellellogram , rectangle , rhombus , isoscales , equilateral triangle
package Lec2;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = num.nextDouble();

        System.out.println("Enter the length : ");
        double length = num.nextDouble();

        System.out.println("Enter the breadth : ");
        double breadth = num.nextDouble();

        double areaCircle = Math.PI * radius * radius;
        double areaTriangle = 0.5 * length * breadth;
        double areaParellelogram = length * breadth;
        double areaRectangle = length * breadth;
        double areaRhombus = length * breadth;
        double areaIsoscales = 0.5 * length * breadth;
        double areaEquilateral = ((Math.sqrt(3)/4) * length * length);

        System.out.println("Area of Circle " + areaCircle);
        System.out.println("Area 0 of Triangle " + areaTriangle);
        System.out.println("Area of Parellelogram " + areaParellelogram);
        System.out.println("Area of Rectangle " + areaRectangle);
        System.out.println("Area of Rhombus " + areaRhombus);
        System.out.println("Area of Isoscales " + areaIsoscales);
        System.out.println("Area of Equilateral " + areaEquilateral);
    }
      

    
}