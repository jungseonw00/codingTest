package com.study.algorithm.site.programmers.level_0;

import static java.lang.String.valueOf;

public class Main36 {

	public static void main(String[] args) {
		solution(12, 21);
	}

	private static int solution(int a, int b) {

		Double result = (double) a / b;
		String convertResult = valueOf(result);

		return convertResult.length() >= 16 ? 2 : 1;
	}
}
