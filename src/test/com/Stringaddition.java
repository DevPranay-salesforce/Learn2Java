
package test.com;

public class Stringaddition {
	String a = "$450.99";
	String b = "$499";
	String result = a + b;
	//System.out.println("value:"+ result);
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double sum2 = calculator.add(450.99, 499);
		
		System.out.println("Sum 2: " +"$"+ sum2);
			/*
		 * // TODO Auto-generated method stub Calculator calculator = new Calculator();
		 * String str1="$450.99,"; String str2="$499,";
		 * 
		 * double sum2 = calculator.add("$450.99","$499"); System.out.println("Sum 2: "
		 * + sum2);
		 */

		/*
		 * //String Total= str1 + str2; System.out.println("ItechCloud:"+sum2);
		 */
	}
}