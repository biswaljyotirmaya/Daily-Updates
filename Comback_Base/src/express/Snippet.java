package express;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Snippet {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
		list.stream().filter(n -> n % 2 == 0).peek(n -> list.remove(n)).collect(Collectors.toList());
	}
}
