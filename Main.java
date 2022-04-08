import java.util.Arrays;

import io.vavr.collection.List;


class Main {

	private static List<Integer> numbers = List.empty();

	public static void main(String[] args) {
		for (Integer i = 2; i < 100; i++) {
			if (i == 2) {
				numbers = numbers.append(i);
				continue;
			}

			if (i % 2 == 0) { continue; }
	
			if (i % (i - 1) == 0) {
				numbers = numbers.append(i);
			}
		}
		

		System.out.println(numbers);
   	}

}

