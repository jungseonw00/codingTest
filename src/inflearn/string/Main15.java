package inflearn.string;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(in);
        int n = kb.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }

        System.out.println(solution(n, a, b));
    }

    static String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            // A가 이길 때
            if (a[i] == b[i]) {
                answer += "D";
            } else if (a[i] == 1 && b[i] == 3) {
                answer += "A";
            } else if (a[i] == 2 && b[i] == 1) {
                answer += "A";
            } else if (a[i] == 3 && b[i] == 2) {
                answer += "A";
            // B가 이길 때
            } else if (a[i] == 3 && b[i] == 1) {
                answer += "B";
            } else if (a[i] == 1 && b[i] == 2) {
                answer += "B";
            } else if (a[i] == 2 && b[i] == 3) {
                answer += "B";
            }
        }
        return answer;
    }
}