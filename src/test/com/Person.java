package test.com;

public class Person {

	private String name, bb, cc;
	private int age;
	
	
	private String name1, bb1, cc1;
	private int age1;
	


	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getBb1() {
		return bb1;
	}

	public void setBb1(String bb1) {
		this.bb1 = bb1;
	}

	public String getCc1() {
		return cc1;
	}

	public void setCc1(String cc1) {
		this.cc1 = cc1;
	}

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public String getName1() {
		return name1;
	}

	public String getName() {
		return name;
	}

	public String getbb() {
		return bb;
	}

	public String getcc() {
		return cc;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setName1(String newName1) {
		bb = newName1;
	}

	public void setName2(String newName2) {
		cc = newName2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		if (newAge >= 0) {
			age = newAge;
		} else {
			System.out.println("Invalid age!");
		}
	}

	public static void main(String[] args) {
			Person p = new Person();
			p.setName("Vinod");
			p.setName1("Vinod1");
			p.setName2("Vinod2");
			p.setAge(-11110);
			
			//p.getName();

	  System.out.println(p.getName()); 
	  System.out.println(p.getbb ());
	  System.out.println(p.getcc ());
	  System.out.println(p.getAge());
	  
	  
	  
	  }


		  }
		  
		 	
	


