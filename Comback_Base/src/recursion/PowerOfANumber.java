package recursion;

public class PowerOfANumber {

	public static int powerOfNum(int num, int pow) {
		if (pow == 0) {
			return 1;
		}
		return num * powerOfNum(num, pow - 1);
	}

	public static void main(String[] args) {
		System.out.println(PowerOfANumber.powerOfNum(3, 3));
	}

}
