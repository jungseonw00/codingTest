package com.study.algorithm.inflearn.intro.ch03_twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 공통원소 구하기 (two pointers algorithm)
 */
public class Main2_공통원소구하기 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}

		int m = kb.nextInt();

		int[] b = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = kb.nextInt();
		}

		solution(n, m, a, b);
	}

	private static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList();
		// 오름차순 정렬
		Arrays.sort(a);
		Arrays.sort(b);

		// 포인터
		int p1 = 0, p2 = 0;

		// 대소비교후 작은 쪽 배열의 인덱스를 증가시킨다.
		while (p1 < n && p2 < m) {
			if (a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			} else if (a[p1] < b[p2]) {
				p1++;
			} else {
				p2++;
			}
		}

		return answer;
	}
}
