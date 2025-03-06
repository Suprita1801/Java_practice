// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package Intro;
import java.util.Scanner;

class q4{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the value of X : ");
        int X = num.nextInt();

        System.out.println("Enter the value of Y : ");
        int Y = num.nextInt();

        System.out.println("Enter the operator : ");
        String op = num.next();

        int sum = X + Y;
        int sub = X - Y;
        int product = X * Y;
        int quotient = X / Y;


        if(op.equals("+")){
            System.out.println("The sum of X and Y is : " + sum);
        }
        else if(op.equals("-")){
            System.out.println("The difference of X and Y is : " + sub);
        }
        else if(op.equals("*")){
            System.out.println("The producr of X and Y is : " + product);
        }
        else if(op.equals("/")){
            System.out.println("The quotient obtained from X and Y is : " + quotient);
        }
        else{
            System.out.println("Invalid operator !! ");
        }

    }
}