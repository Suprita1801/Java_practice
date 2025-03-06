// Fibonacci Series
package Intro;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int N = num.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= N){
            int temp = b;
            b = b + a;
            a = temp ;
            count++;
        }
        System.out.println("The Nth number in the fibonacci series is : " + b);
    }
}
