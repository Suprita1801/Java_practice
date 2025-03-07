// Perimeter of a rectangle , square , circle , triangle , parallelogram , rhombus  , equilateral triangle
package Lec2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");
        double R = num.nextDouble();

        System.out.println("Enter the length : ");
        double L = num.nextDouble();

        System.out.println("Enter the breadth : ");
        double B = num.nextDouble();

        System.out.println("Enter the side : ");
        double A = num.nextDouble();

        double perimeterCircle = 2 * Math.PI * R;
        double perimeterSquare = 4 * A;
        double perimeterRectangle = 2 * (L + B );
        double perimeterParellelogram = 2 * (L + B);
        double perimeterRhombus = 4 * A;
        double perimeterEq_Triangle = 3 * A;

        System.out.println("Perimeter of Circle : " +perimeterCircle);
        System.out.println("Perimeter of Square : " +perimeterSquare);
        System.out.println("Perimeter of Rectangle : " +perimeterRectangle);
        System.out.println("Perimeter of Parellelogram : " +perimeterParellelogram);
        System.out.println("Perimeter of Rhombus : " +perimeterRhombus);
        System.out.println("Perimeter of Equilateral Triangle : " +perimeterEq_Triangle);

    }
}