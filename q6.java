// Input currency in rupees and output in USD

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the amount in Indian ruppes : ");
        double INR = num.nextDouble();

        double USD = INR/87;

        System.out.println("The amount in USD is : " + USD);
    }
    
}
