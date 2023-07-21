package test.com;

import java.util.Scanner;

public class ArmstrongNumberClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int temp = num;
        int count = 0;
        int sum = 0;

        // Count the number of digits
        while (num > 0) {
            num = num / 10;
            count++;
        }

        num = temp;

        // Calculate the sum of digits raised to the power of count
        while (num > 0) {
            int rem = num % 10;
            int val = 1;

            for (int i = 1; i <= count; i++) {
                val = val * rem;
            }

            num = num / 10;
            sum = sum + val;
        }

        // Check if the number is Armstrong or not
        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }

        scanner.close();
    }
}
