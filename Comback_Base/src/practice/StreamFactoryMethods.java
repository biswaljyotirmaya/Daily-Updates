package practice;

public class StreamFactoryMethods {
	public static void main(String[] args) {

//		1. builder()
//		Builder<String> builder = Stream.builder();
//
//		Consumer<String> consumer = builder.andThen(s -> System.out.println("Fetching: " + s));
//
//		consumer.accept("Rani Panda");
//		consumer.accept("Nisha Maharana");
//		consumer.accept("Basanti Das");
//		consumer.accept("Anupama Das");
//		consumer.accept("Sahu Bhauja");
//
//		Stream<String> stringStream = builder.build();
//		stringStream.forEach(System.out::println);

//		2. empty()
//		Stream<String> s = null;
//		Stream<String> s = Stream.empty();
//		s.forEach(System.out::println);

//		3. of(T)
//		Stream<String> s = Stream.of("Rani Panda");
//		s.forEach(System.out::println);

//		4. of(T...)
//		Stream<String> s = Stream.of("Rani Panda", "Nisha Maharana");
//		s.forEach(System.out::println);

//		5. ofNullable(T)
//		Stream<String> s = Stream.of("Rani Panda", "", null, "Nisha Didi").flatMap(Stream::ofNullable);
//		s.forEach(System.out::println);

//		6. iterate(T seed, UnaryOperator<T>)
//		Stream<Long> s = Stream.iterate(Long.valueOf(1), (i) -> i = i + i).limit(60);
//		s.forEach(System.out::println);

//		 Fibonacci Series
//		Stream.iterate(new int[] { 0, 1 }, a -> new int[] { a[1], a[0] + a[1] }).limit(10).map(a -> a[0])
//				.forEach(System.out::println);

//		7. iterate(T, java.util.function.Predicate<? super T>, java.util.function.UnaryOperator<T>);
//		Stream.iterate(0, i -> i < 10, a -> a = a + 1).map(i -> i + 3).forEach(System.out::println);

//		Fibonacci Series
//		Stream.iterate(new int[] { 0, 1 }, a -> a[0] < 10, a -> new int[] { a[1], a[0] + a[1] }).map(a -> a[0])
//				.forEach(System.out::println);

//		8.generate(java.util.function.Supplier<? extends T>);
//		Stream.generate(() -> new String[] { " * ", " * ", " * ", " * ", " * " }).limit(5)
//				.forEach(x -> System.out.println(String.join("", x)));

//		Stream.generate(() -> Collections.nCopies(6, " * ")).limit(6)
//				.forEach(arr -> System.out.println(String.join("<-", "->", arr)));
	}
}
