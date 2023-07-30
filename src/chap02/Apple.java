package chap02;

import java.util.List;

import chap02.prettyprintapple.PrettyPrintAppleOutput;
import chap03.Fruit;

public class Apple extends Fruit {
	private int weight;
	private Color color;

	public Apple(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public Apple(int weight, Color color) {
		this.weight = weight;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public static void prettyPrintApple(List<Apple> inventory, PrettyPrintAppleOutput prettyPrintAppleOutput) {
		for (Apple apple : inventory) {
			String output = prettyPrintAppleOutput.test(apple);
			System.out.println(output);
		}
	}
}
