package chap02;

import java.util.ArrayList;
import java.util.List;

import chap02.prettyprintapple.ColorPrettyPrintAppleOutput;
import chap02.prettyprintapple.WeightPrettyPrintAppleOutput;

public class Quiz01 {
	public static void main(String[] args) {
		Apple apple = new Apple(25, Color.RED);
		Apple apple2 = new Apple(15, Color.GREEN);

		List<Apple> inventory = new ArrayList<>();
		inventory.add(apple);
		inventory.add(apple2);

		Apple.prettyPrintApple(inventory, new ColorPrettyPrintAppleOutput());
		Apple.prettyPrintApple(inventory, new WeightPrettyPrintAppleOutput());
	}
}
