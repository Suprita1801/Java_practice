// Take two numbers as input and print the largest number.

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter the value of number1 : ");
        int num1 = num.nextInt();

        System.out.println("Enter the value of num2 : ");
        int num2 = num.nextInt();

        if(num1 > num2){
            System.out.println("Number1 is greater than Number2");  

        }
        else if(num2 > num1){
            System.out.println("Number2 is greater than Number1");  
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
    
}
