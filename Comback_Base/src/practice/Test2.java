package practice;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test2 {
	public static void main(String[] args) {

//        Map<String, Integer> map = new HashMap<>();
//        map.put("Banana", 2);
//        map.put("Apple", 5);
//        map.put("Mango", 3);
//
//        map.entrySet()
//           .stream()
//           .sorted(Map.Entry.comparingByKey())
//           .forEach(System.out::println);

		Map<Integer, Optional<String>> map = Stream.of("a", "bb", "cc", "ddd","cccc")
				.collect(Collectors.groupingBy(String::length, Collectors.maxBy(Comparator.<String>naturalOrder())));
		System.out.println(map);
	}
}