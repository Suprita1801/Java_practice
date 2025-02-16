import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the Principle : ");
        double P = num.nextDouble();

        System.out.println("Enter the time :");
        double T = num.nextDouble();

        System.out.println("Enter the rate :");
        double R = num.nextDouble();

        double SI = (P*T*R)/100;

        System.out.println("The Simple Interest is : " + SI);
    }
}