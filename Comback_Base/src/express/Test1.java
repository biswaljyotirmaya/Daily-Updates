package express;

public class Test1 {
	static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	static int max(int[] arr) {
		int m = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (m < arr[i]) {
				m = arr[i];
			}
		}
		return m;
	}

	static long factorial(int n) {
		int f = 1;
		for (int i = 2; i < n; i++) {
			f = f * i;
		}
		return f;
	}

	static boolean isPalindrome(String str) {
		return str.equals(Test1.reverse(str));
	}

	static int sum(int arr[]) {
		int s = 0;
		for (int i : arr) {
			s += i;
		}
		return s;
	}

	public static void main(String[] args) {
		String reverse = Test1.reverse("Hello Babe");
		System.out.println("The reverse of the string is: " + reverse);

		int max = Test1.max(new int[] { 3, 5, 6, 7, 8, 9, 4, 53, 45, 345, 543, 54 });
		System.out.println("The maximum from the array is: " + max);

		long factorial = Test1.factorial(8);
		System.out.println("The factorial of 8 is: " + factorial);

		boolean palindrome = Test1.isPalindrome("Bitch");
		System.out.println("Bitch is palindrome: " + palindrome);

		int sum = Test1.sum(new int[] { 1, 2, 4, 5, 67 });
		System.out.println("The sum is: " + sum);
	}
}
