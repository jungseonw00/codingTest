package com.study.algorithm.inflearn.intro.ch02_array;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.max;

import java.util.Scanner;

/**
 * 격자판 최대합
 */
public class Main9_격자판최대합 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		System.out.println(solution(n, arr));
	}

	private static int solution(int n, int[][] arr) {
		int answer = MIN_VALUE;
		// sum1: 행의 합, sum2: 열의 합
		int sum1, sum2;

		// 행, 열의 합 구한 뒤 비교
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j]; // 행의 합
				sum2 += arr[j][i]; // 열의 합
			}
			answer = max(answer, sum1);
			answer = max(answer, sum2);
		}

		sum1 = sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n - i - 1];
		}
		answer = max(answer, sum1);
		answer = max(answer, sum2);

		return answer;
	}
}