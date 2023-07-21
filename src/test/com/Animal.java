package test.com;
//overloading//
public class Animal {

	public void fun1() {
		System.out.println("without parameter");
	}

	public void fun1(int k) {

		System.out.println("value of integer :" + k);
	}

	public void fun1(String y ){
		
		System.out.println("value of integer :" + y);

	}

	public void fun1(String x, int p) {

		System.out.println("value of string :" + p + " " + x);
	}

	public void fun1(int p, String k) {

		System.out.println("value of string :" + p + " " + k);
	}

	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.fun1();

		ani.fun1("JACK");
		ani.fun1(5456, "sadf");
		ani.fun1("ITECH", 0);
		// System.out.println("value of string :" + ani);
	}
}
