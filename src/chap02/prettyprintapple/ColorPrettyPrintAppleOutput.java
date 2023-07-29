package chap02.prettyprintapple;

import chap02.Apple;

public class ColorPrettyPrintAppleOutput implements PrettyPrintAppleOutput {
	public ColorPrettyPrintAppleOutput() {
	}

	@Override
	public String test(Apple apple) {
		return "사과의 색은 " + apple.getColor().toString() + " 입니다";
	}
}
