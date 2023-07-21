package test.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestVP {

	public static void main(String[] args) {
		int age[] = {45,78,96,1,2,3,56,44};
		
		 Arrays.sort(age);
		
		for (int i : age) {
			
		}
		int highest = age[4];
		System.out.println("Highest No :" + " " + highest);
		
	}

}
