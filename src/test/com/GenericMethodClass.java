package test.com;

public class GenericMethodClass {

	 public static <T> void printArray(T[] array) {
	        for (T element : array) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Integer[] intArray = { 1, 2, 3, 4, 5 };
	        Double[] doubleArray = { 1.1514564655616146143614361414613333331321321312, 2.2, 3.3, 4.4, 5.5 };
	        String[] stringArray = { "Hello", "World", "Java" };

	        System.out.print("Integer Array: ");
	        printArray(intArray);

	        System.out.print("Double Array: ");
	        printArray(doubleArray);

	        System.out.print("String Array: ");
	        printArray(stringArray);
	        final double PI = 3.14159;
	    }
	
}
