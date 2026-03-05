package basicDSA;

import java.util.Scanner;

public class PrintPrimeNumberInRange {

	public static void primeInRange(int num1, int num2) {
		for (int i = num1; i < num2; i++) {
			if (PrimeNumber.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number to check prime: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Please enter the end number: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("Prime numbers are: ");
		PrintPrimeNumberInRange.primeInRange(num1, num2);
		sc.close();
	}

}
