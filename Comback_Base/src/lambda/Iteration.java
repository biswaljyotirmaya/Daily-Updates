package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Iteration {
	public static void main(String[] args) {
		String[] locations = new String[] { "London", "Bangalore", "New York", "Mumbai", "Beijing" };

		// Iterating an array using lambda expression
		Arrays.stream(locations).forEach(location -> System.out.print(location + " "));

		// Iterating an array using method reference
		Arrays.stream(locations).forEach(System.out::println);

		// Creating a list
		List<String> asList = Arrays.asList(locations);

		// Iterating a list
		asList.forEach(System.out::println);

		// Creating a map
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(101, "Rani Panda");
		hashMap.put(102, "Nisha Maharana");
		hashMap.put(103, "Sahu Bhauja");

		// Iterating a map
		hashMap.forEach((key, value) -> System.out.println(key + " -> " + value));
	}
}
