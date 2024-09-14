package com.study.algorithm.book.codingtest_learn.ch06;

import java.util.Stack;

/**
 * 짝지어 제거하기
 */
public class Main11 {

	public static void main(String[] args) {
		int answer1 = solution("baabaa");
		int answer2 = solution("cdcd");

		System.out.println("answer = " + answer1);
		System.out.println("answer = " + answer2);
	}

	private static int solution(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}
}
