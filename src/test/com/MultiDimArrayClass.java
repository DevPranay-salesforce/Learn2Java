package test.com;

public class MultiDimArrayClass {

	public static void main(String[] args) {
		
		
		Demo12121 obj = new Demo12121();

        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();

        System.out.println(obj.i);
        System.out.println(obj.k);
        System.out.println(obj.p);
        System.out.println(obj.d);
		// TODO Auto-generated method stub
		int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {75, 54, 99} ,{15, 89, 98} };

		// Accessing elements in the 2D array
		int element = matrix[4][2]; // Accessing the element at row 1, column 2 (6)

		System.out.println(element);
	}

}
