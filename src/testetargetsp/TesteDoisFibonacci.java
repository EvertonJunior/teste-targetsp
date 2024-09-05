package testetargetsp;

import java.util.ArrayList;
import java.util.List;

public class TesteDoisFibonacci {

	public static void main(String[] args) {
		long num = 100L;
		List<Long> fibonacci = new ArrayList<>();
		fibonacci.add(0L);
		fibonacci.add(1L);
		for (int i = 0; i < num; i++) {
			fibonacci.add(fibonacci.get(i) + fibonacci.get(i + 1));
		}

		fibonacci.forEach(System.out::println);

		if (fibonacci.contains(num)) {
			System.out.println("O número " + num + " pertence a sequência de Fibonacci");
		} else {
			System.out.println("O número " + num + " nao pertence a sequência de fibonacci");
		}
	}

}
