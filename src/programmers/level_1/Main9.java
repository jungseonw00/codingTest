package programmers.level_1;

public class Main9 {

    public static void main(String[] args) {
        String s = "pPoooyY";
        solution(s);
    }
    static boolean solution(String s) {
        int cnt = 0;
        s = s.toLowerCase();
        for (char x : s.toCharArray()) {
            if (x == 'p') cnt++;
            else if (x == 'y') cnt--;
        }

        return cnt == 0 ? true : false;
    }
}
