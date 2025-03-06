package Intro;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the Principle amount :");
        int P = num.nextInt();

        System.out.println("Enter the years : ");
        int N = num.nextInt();

        System.out.println("Enter the rate of interest : ");
        int R = num.nextInt();

        int SI = (P*N*R)/100;

        System.out.println("The Simple interest is : " + SI);
        
    }
    
}
