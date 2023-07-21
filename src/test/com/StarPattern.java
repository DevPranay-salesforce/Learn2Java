package test.com;

public class StarPattern {

	public static void main(String[] args) {
		int rows =20;
		int k = 1;
		for (int i = rows; i >= 1; i--) {

			for (int j = i - 1; j >= 1; j--)
				System.out.print(" ");

			for (int p = 1; p <= k; p++) {
				System.out.print("*");
			}

			k++;
			// System.out.println(k);
			System.out.println("*");

		}

	}
}
