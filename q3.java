import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int P = num.nextInt();
        int T = num.nextInt();
        int R = num.nextInt();

        int SI = (P*T*R)/100;

        System.out.println("The Simple Interest is : " + SI);
    }
}