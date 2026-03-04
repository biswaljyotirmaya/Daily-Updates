package lambda;

import java.util.Arrays;
import java.util.List;

public class RemovingDuplicates {

	/*
	 * distinct() method removes duplicates from the input source. It is an
	 * intermediate operation which consumes a stream and returns a stream of only
	 * distinct elements.
	 */

	public static void main(String[] args) {
		int[] numberArray = new int[] { 45, 23, 76, 37, 45, 81, 23, 76, 45 };

		// Removing duplicates from an array
		Arrays.stream(numberArray).distinct().forEach(e -> System.out.print(e + " "));
		System.out.println();

		// Removing duplicates from a list
		List<String> names = Arrays.asList("Arun", "Henry", "Suvarna", "Arun", "Mansi", "Henry");
		names.stream().distinct().forEach(e -> System.out.print(e + " "));
	}

}
