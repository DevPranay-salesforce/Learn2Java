																	package test.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionListSetMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities = new HashSet<String>();
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("London");
		cities.add("London");// Duplicate element, will be ignored

		System.out.print(cities); // Output: [Tokyo, Paris, London]

		boolean containsParis = cities.contains("Paris");
		System.out.println(containsParis); // Output: true

		boolean containsIndia = cities.contains("India");
		System.out.println(containsIndia); // Output: false

		cities.remove("Tokyo");
		System.out.println(cities);
		// Output: [Paris, London]

		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange22");
		System.out.println(fruits); // Output: [Apple,Banana, Orange]

		String firstFruit = fruits.get(0);
		System.out.println(firstFruit); // Output:Apple

		fruits.remove(4);
		System.out.println(fruits); // Output: [Apple, Orange]

		Map<String, Integer> map = new HashMap<String, Integer>();

		// Adding elements to the map
		map.put("John", 30);
		map.put("Emily", 30);
		map.put("Adam", 28);
		map.put("Adam", 28);

		// Accessing elements
		int age = map.get("John");
		System.out.println("John's age: " + age);
		//Accessing the size
		int size = map.size();
		System.out.println("Map size is:" + size);

		// Checking if a key exists
		boolean containsKey = map.containsKey("Adam");
		System.out.println("Contains key 'Adam': " + containsKey);

		// Iterating over the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String name = entry.getKey();
			int value = entry.getValue();
			System.out.println(name + " is " + value + " years old.");
		}

		// Removing an element
		map.remove("Emily");
		
		System.out.println("Map after removing 'Emily': " + map);
		map.clear();
		System.out.println("Map all removing : "+map);
		
	}
}
