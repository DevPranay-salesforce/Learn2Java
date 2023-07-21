package test.com;

// overloading //
public class Calculator {

	public int add(int a, int b) {
		return b;

	}

	public double add(double a, double b) {
		return a + b;
	}

	public float add(float a, double b, double c) {
		return (float) (a + b + c);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int sum1 = calculator.add(5, 10);
		System.out.println("Sum 1: " + sum1);

		double sum2 = calculator.add(2.5, 3.7);
		System.out.println("Sum 2: " + sum2);

		float sum3 = calculator.add(1.222f, 2.33, 3.544);
		System.out.println("Sum 3: " + sum3);
	}
}
