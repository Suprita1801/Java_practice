// Input currency in rupees and output in USD.
package Intro;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the value in rupees : ");
        double INR = num.nextDouble();

        double USD = INR/74.85;

        System.out.println("The value in USD is : " + USD);
        

        
    }
}
