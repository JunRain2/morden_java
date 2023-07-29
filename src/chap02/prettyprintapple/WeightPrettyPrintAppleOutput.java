package chap02.prettyprintapple;

import chap02.Apple;

public class WeightPrettyPrintAppleOutput implements PrettyPrintAppleOutput{
	@Override
	public String test(Apple apple) {
		return "사과의 무게는 " + apple.getWeight() + " 입니다.";
	}
}
