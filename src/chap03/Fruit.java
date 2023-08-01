package chap03;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import chap02.Apple;

public class Fruit {

	static Map<String, Function<Integer, Fruit>> map = new HashMap<>();

	static {
		map.put("apple", Apple::new);
		map.put("orange", Orange::new);
	}

	public Fruit giveMeFruit(String fruit, Integer weight) {
		return map.get(fruit)
			.apply(weight);
	}

	public static void main(String[] args) {
	}

}
