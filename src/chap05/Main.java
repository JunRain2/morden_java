package chap05;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs = numbers1.stream()
			.flatMap(i -> numbers2.stream()
				.map(j -> new int[] {i, j}))
			.collect(toList());

	}
}
