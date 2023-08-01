package chap05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TraderMain {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000),
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2012, 700),
			new Transaction(alan, 2012, 950)
		);

		List<Transaction> transactions1 =
			transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());

		List<String> transactions2 =
			transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());

		List<String> transactions3 =
			transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(transaction -> transaction.getTrader().getName())
				.distinct()
				.sorted()
				.collect(Collectors.toList());

		List<String> transactions4 =
			transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.sorted()
				.distinct()
				.collect(Collectors.toList());

		boolean transactions5 =
			transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

		List<Integer> transactions6 =
			transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(transaction -> transaction.getValue())
				.collect(Collectors.toList());

		Optional<Integer> transactions7 =
			transactions.stream()
				.map(transaction -> transaction.getValue())
				.reduce(Integer::max);

		Optional<Integer> transactions8 =
			transactions.stream()
				.map(transaction -> transaction.getValue())
				.reduce(Integer::min);


		System.out.println("transactions1 = " + transactions1);
		System.out.println("transactions2 = " + transactions2);
		System.out.println("transactions3 = " + transactions3);
		System.out.println("transactions4 = " + transactions4);
		System.out.println("transactions5 = " + transactions5);
		System.out.println("transactions6 = " + transactions6);
		System.out.println("transactions6 = " + transactions7);
		System.out.println("transactions6 = " + transactions8);

	}
}
