package chap03;

import chap02.Color;

public class Orange extends Fruit {
	Color color;

	public Orange(Color color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public Orange(int weight) {
		this.weight = weight;
	}

	int weight;
}
