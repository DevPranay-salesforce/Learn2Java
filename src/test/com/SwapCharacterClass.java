package test.com;

public class SwapCharacterClass {
	public static String swapCharacters(String s, int B, int C) {
		int N = s.length();
// If c is greater than n
		C = C % N;
// loop to swap ith element with (i + C) % n th
// element
		char[] arr = s.toCharArray();
		for (int i = 0; i < B; i++) {
			char temp = arr[i];
			arr[i] = arr[(i + C) % N];
			arr[(i + C) % N] = temp;
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		String s = "ABCDEFGH";
		int B = 4;
		int C = 3;
		s = swapCharacters(s, B, C);
		System.out.println(s);
	}
}
