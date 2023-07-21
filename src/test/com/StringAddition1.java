package test.com;
//addition of two string value.// 
import java.util.Scanner;

public class StringAddition1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string value: ");
		String num1 = scanner.nextLine();

		System.out.print("Enter the second string value: ");
		String num2 = scanner.nextLine();

		double sum = addStrings(num1, num2);
		String result = formatAsCurrency(sum);

		System.out.println("Sum: " + result);

		scanner.close();
	}

	public static double addStrings(String str1, String str2) {
		double value1 = Double.parseDouble(str1.substring(1));
		double value2 = Double.parseDouble(str2.substring(1));

		return value1 + value2;
	}

	public static String formatAsCurrency(double value) {
		return "$" + value;
	}
}
	