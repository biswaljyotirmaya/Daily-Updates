package lambda;

import java.util.Arrays;
import java.util.List;

public class Filtering {
	public static void main(String[] args) {
		/*
		 * filter() method is used to filter the elements according to supplied
		 * Predicate
		 */

		List<Integer> numbers = Arrays.asList(16, 21, 90, 11, 71, 20, 5, 42, 35);

		// filtering only odd numbers
		numbers.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));
		System.out.println();

		// filtering only even numbers
		numbers.stream().filter(number -> number % 2 == 0).forEach(e -> System.out.print(e + " "));
		System.out.println();

		List<String> strings = Arrays.asList("London", "Python", "Burma", "Java", "New Jersey");
		System.out.println();

		// Filtering strings with length > 5
		strings.stream().filter(string -> string.length() > 5).forEach(e -> System.out.print(e + " "));
		System.out.println();

		// Filtering strings containing a letter 'o'
		strings.stream().filter(string -> string.contains("o")).forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		
	}
}
