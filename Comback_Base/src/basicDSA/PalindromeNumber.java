package basicDSA;

import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindrome(int a) {
		if (Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString())) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number to check palindrome: ");
		int num = Integer.parseInt(sc.nextLine());
		boolean palindrome = isPalindrome(num);
		if (palindrome) {
			System.out.println(num + " is a palindrome number!");
		} else {
			System.out.println(num + " is not a palindrome number!");
		}
		sc.close();
	}
}
