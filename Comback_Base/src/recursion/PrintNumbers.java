package recursion;

public class PrintNumbers {

	public static void printNum(int n) {
		if (n == 0) {
			return;
		}
		printNum(n - 1);
		System.out.print(n + " ");
	}

	public static void printNumRev(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + " ");
		printNumRev(n - 1);
	}

	public static void main(String[] args) {
		PrintNumbers.printNum(5);
		System.out.println();
		PrintNumbers.printNumRev(5);
	}

}
