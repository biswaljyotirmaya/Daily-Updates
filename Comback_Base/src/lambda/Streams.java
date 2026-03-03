package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		List<String> nameList = Arrays.asList("Henry", "Pavan", "Somy", "Azhar", "Ira");

		// Creating a sequential stream from a collection
		Stream<String> stream = nameList.stream();

		// Creating a parallel stream from a collection
		Stream<String> parallelStream = nameList.parallelStream();

		// Creating a sequential stream from values
		Stream<String> of = Stream.of("Rani Panda", "Nisha Maharana", "Sahu Bhauja");

		// Creating a sequential stream from an array
		Stream<String> stream2 = Arrays.stream(new String[] { "Rani Panda", "Nisha Maharana", "Sahu Bhauja" });

		// Creating a sequential stream from Stream.builder()
		Stream<Object> stream3 = Stream.builder().add("Sunny Leone").add("Mia Khalifa").add("Danny Daniels")
				.add("Mia Malkova").build();

		// Creating an infinite stream from Stream.generate()
		Stream<Double> limit = Stream.generate(Math::random).limit(12);

		// Creating an infinite stream from Stream.iterate()
		Stream<Integer> limit2 = Stream.iterate(0, i -> i++).limit(13);

		// Creating Primitive Streams
		IntStream of2 = IntStream.of(100000, 2000000, 3000000, 4000000);
		LongStream of3 = LongStream.of(1234L, 343243l, 432432l, 34069834l);
		DoubleStream of4 = DoubleStream.of(12.4, 453.3, 4534.4, 54464.2, 754.3);

		// Creating a stream from Files
		@SuppressWarnings("resource")
		Stream<String> lines = Files.lines(Paths.get("Sample.txt"));
		@SuppressWarnings("resource")
		Stream<Path> list = Files.list(Path.of("C:\\"));
	}
}
