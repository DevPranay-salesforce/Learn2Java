package test.com;
// Reverse the position of words //
public class ReverseClassNumber {
	  static String reverseWords(String str) {
	        // Splitting the string by whitespace
	        String[] temp = str.split("\s");
	        for (String temp1 : temp) {
				System.out.println(temp1);
			}
	        StringBuilder result = new StringBuilder();

	        // Iterate over the temp array and store the strings in reverse order
	        for (int i = temp.length - 1; i >= 0; i--) {
	            result.append(temp[i]);
	            if (i != 0) {
	                result.append(" ");
	            }
	        }
	        return result.toString();
	    }

	    // Driver method to test the reverseWords() function
	    public static void main(String[] args) {
	        String s1 = "Welcome to geeksforgeeks";
	        System.out.println(reverseWords(s1));

	        String s2 = "I start the Programming";
	        System.out.println(reverseWords(s2));
	        
//	        StringBuffer s21 = new StringBuffer("I love Javghjhjlknjjna Programming");
//	        System.out.println(s21.reverse());
	    }
	}
	