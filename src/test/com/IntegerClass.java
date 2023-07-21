package test.com;

public class IntegerClass {

	 public static void main(String[] args) {
	        int x = 4; // x is a local variable
	        String message = "Hello, world!"; // message is also a local variable
	         
	        System.out.println("x = " + x);
	        System.out.println("message = " + message);
	         
	        if (x > 5) {
	            String result = "x is greater than 5"; // result is a local variable
	            System.out.println(result);
	        }
	        else {
				System.out.println("Assign condition is wrong ");
			}
	        // Uncommenting the line below will result in a compile-time error
	        // System.out.println(result);
	         
	        for (int i = 0; i <= 3; i++) {
	            String loopMessage = "Iteration " + i; // loopMessage is a local variable
	            System.out.println(loopMessage);
	        }
	         
	        // Uncommenting the line below will result in a compile-time error
	        // System.out.println(loopMessage);
	        System.out.println();
	    
	    
	        for (int x1 = 0; x1 < 5; x1++)
	        {
	            System.out.println(+x1);
	        }
	 
	        // Will produce error
	       // System.out.println(x);
	    }
}

		        		

		        
	    
	
		
	
	


