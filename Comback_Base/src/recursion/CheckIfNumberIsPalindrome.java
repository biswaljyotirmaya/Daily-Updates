package recursion;

public class CheckIfNumberIsPalindrome {

	public static int revNum(int n, int rev) {
		if (n == 0) {
			return rev;
		}
		return revNum(n / 10, rev * 10 + (n % 10));
	}

	public static boolean ifPalindrome(int num) {
		return num == revNum(num, 0);
	}

	public static void main(String[] args) {
		System.out.println(CheckIfNumberIsPalindrome.ifPalindrome(12321));
	}

}
