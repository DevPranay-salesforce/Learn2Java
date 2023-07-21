package test.com;

public class Test1 {
	    public int    i    =  111;
	    protected int k    =  222;
	    private int   p    =  333;
	    int           d    =  444;

	    public void test11() {
	        System.out.println("public void test1()");
	    }

	    protected void test22() {
	    	i=455;
	        System.out.println("protected void test2()");
	    }

	    void test33() {
	        System.out.println("void test3()");
	    }

	    private void test44() {
	        System.out.println("private void test4()");
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	Test1 obj1 = new Test1();

	        obj1.test11();
	        obj1.test22();
	        obj1.test33();
	        obj1.test44();

	        System.out.println(obj1.i);
	        System.out.println(obj1.k);
	        System.out.println(obj1.p);
	        System.out.println(obj1.d);
	    }
	}


