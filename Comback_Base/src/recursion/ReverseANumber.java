package recursion;

public class ReverseANumber {

	public static int revNum(int n, int rev) {
		if (n == 0) {
			return rev;
		}
		return revNum(n / 10, rev * 10 + (n % 10));
	}

	public static void main(String[] args) {
		System.out.println(ReverseANumber.revNum(3253, 0));
	}

}
