package test.com;
import java.util.Scanner;

public class MulClass1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Limit of Multiplication Table:");

        int num = sc.nextInt();

        System.out.println("***MULTIPLICATION TABLE***");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + i * j + " ");
            }
            System.out.println("");
        }
    }
}
