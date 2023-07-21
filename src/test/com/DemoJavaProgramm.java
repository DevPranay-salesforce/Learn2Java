package test.com;

public class DemoJavaProgramm {

	public static void main(String[] args) {
		int i1=10;
		int i2=20;
		 
		if ((i1 == 20) && (i1 == 30))
		{			
			System.out.println("conditional statementL");

		}
		if(i1!=i1)
		{
		System.out.println("NUMBERS ARE not EQUAL");
	
		}
		else
		{
		
		System.out.println("NUMBERS ARE  EQUAL");
		}
		
		int i3= 30;
		int i4= 40;
		if (i1 < i2) {
		    System.out.println("The number is positive.");
			/*
			 * if (i3 <i4) { System.out.println("nested if else"); } else {
			 * System.out.println("block prog"); }
			 */
		    
		  //  string result = (i3 > i4)? "hello" :"bye";
		    
		    String result = (i3 < i4) ? "hello" : "bye";
		    System.out.println(result);
		} 
		else if (i2 == i4) 
		{
		    System.out.println("The number is non-positive.");
		}
		else {
			System.out.println("only number");
		}
		/*System.out.println(i);
		System.out.println(i+i1 );
		System.out.println(i/i1 );*/
		
	}
	}

	
	 
	