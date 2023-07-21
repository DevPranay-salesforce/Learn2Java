package test.com;

public class CalculateHighestNumber {
	public class SecondHighestNumber {
	    public static void main(String[] args) {
	        int[] numbers = {5, 10, 3, 8, 7, 2};
	        int secondHighest = findSecondHighest(numbers);
	        System.out.println("The second highest number is: " + secondHighest);
	    }
	    
	    public static int findSecondHighest(int[] arr) {
	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > highest) {
	                secondHighest = highest;
	                highest = arr[i];
	            } else if (arr[i] > secondHighest && arr[i] != highest) {
	                secondHighest = arr[i];
	            }
	        }
	        
	        return secondHighest;
	    }
	}

}
