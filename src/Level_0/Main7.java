package Level_0;

import java.util.Arrays;

public class Main7 {

    public static void main(String[] args) {
        System.out.println(solution("ㄹㄷㄴㄱ"));
    }

    static String solution(String my_string) {

        char[] charArr = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(charArr);

        return new String(charArr);
    }
}
