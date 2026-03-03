package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sorting {

	/*
	 * sorted() method of Stream can be used to sort the elements of a List, a Set,
	 * a Map or an array in natural order or according Comparator if supplied.
	 */

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(6, 2, 9, 1, 7, 2, 5);

		// Sorting a list in natural order
		numberList.stream().sorted().forEach(System.out::print);
		System.out.println();

		// Sorting a list in reverse order
		numberList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);

		Set<String> nameSet = Set.of("Henry", "Pavan", "Somy", "Azhar", "Ira");
		System.out.println();

		// Sorting a set in natural order
		nameSet.stream().sorted().forEach(name -> System.out.print(name + " "));
		System.out.println();

		// Sorting a set in reverse order
		nameSet.stream().sorted(Comparator.reverseOrder()).forEach(name -> System.out.print(name + " "));
		System.out.println();

		Map<Integer, String> idToNameMap = new HashMap<Integer, String>();

		idToNameMap.put(123, "Sunny");
		idToNameMap.put(321, "Mia");
		idToNameMap.put(231, "Danny");
		idToNameMap.put(213, "Brandi");
		idToNameMap.put(132, "Jonson");

		// Sorting a map in natural order of keys
		idToNameMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
		System.out.println();

		// Sorting a map in reverse order of keys
		idToNameMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
		System.out.println();

		// Sorting a map in natural order of values
		idToNameMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
		System.out.println();

		// Sorting a map in reverse order of values
		idToNameMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
		System.out.println();

	}
}
