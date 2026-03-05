package basicDSA;

import java.util.Scanner;

public class ArmstrongNumber {
	public static boolean isArmstrong(int num) {
		int original=num;
		int length = Integer.toString(num).length();
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, length);
			num=num/10;
		}
		return sum == original;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number to check armstrong: ");
		int num = Integer.parseInt(sc.nextLine());
		boolean armstrong = isArmstrong(num);
		if (armstrong) {
			System.out.println(num + " is a armstrong number!");
		} else {
			System.out.println(num + " is not a armstrong number!");
		}
		sc.close();
	}
}
