import java.util.Scanner;
public class q4 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the value of X : ");
        int X = num.nextInt();

        System.out.println("Enter the value of Y : ");
        int Y = num.nextInt();

        System.out.println("Enter the operator : ");
        String op = num.next();

        int add = X + Y ;
        int sub = X - Y ;
        int product = X*Y;
        int div = X/Y;

        if(op.equals("+")){
            System.out.println("The sum of two numbers is : " + add);
        }
        else if(op.equals("-")){
            System.out.println("The difference of two number is:" + sub);
        }
        else if(op.equals("*")){
            System.out.println("The product of two number is:" + product);
        }
        else if(op.equals("/")){
            System.out.println("The division of two number is:" + div);
        }
        else{
            System.out.println("Invalid operator ");
        }


    }
}
