package test.com;



import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class CollectionDemo2 {
	 public static void main(String args[]){
	 
	        // creating an empty LinkedList
	        Collection <String> set = new LinkedHashSet<String>();
	 
	        // use add() method to add elements in the list
	       set.add("Geeks");
	       set.add("for");
	       set.add("Geeks");
	 
	        // Output the present list
	        System.out.println("The list is: " +set);
	 
	        // Adding new elements to the end
	        set.add("Last Blast");
	        set.add("Element");
	        set.add("Element11"); 
	        set.add("Element11");
	        set.add("Element33");

	        System.out.println(set.contains("Geeks"));
	        // printing the new list
	        System.out.println("The new List is: " + set);
	        
	    }
	}
