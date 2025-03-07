package Lec2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter the year : ");
        int year = num.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not a Leap Year");
                }
            }else{
                System.out.println("Leap Year");
            }
        }else{
            System.out.println("Not a Leap Year");
        }   
    }
}
    
