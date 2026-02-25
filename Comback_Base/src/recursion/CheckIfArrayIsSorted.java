package recursion;

public class CheckIfArrayIsSorted {

	public static boolean isSorted(int arr[], int index) {
		if (index == arr.length - 1) {
			return true;
		}

		if (arr[index] > arr[index + 1]) {
			return false;
		}
		return isSorted(arr, index + 1);
	}

	public static void main(String[] args) {
		System.out.println(CheckIfArrayIsSorted.isSorted(new int[] { 3, 3, 4, 6, 7, 7, 53 }, 0));
	}

}
