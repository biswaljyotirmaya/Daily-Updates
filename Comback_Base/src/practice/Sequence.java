package practice;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 1, 2, 3, 7, 9, 4, 5, 6, 7, 11, 12 };

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList<>();

		current.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == arr[i - 1] + 1) {
				current.add(arr[i]);
			} else {
				if (current.size() >= 2) {
					result.add(new ArrayList<>(current));
				}
				current.clear();
				current.add(arr[i]);
			}
		}

		if (current.size() >= 2) {
			result.add(new ArrayList<>(current));
		}

		System.out.println(result);
	}
}