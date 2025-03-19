import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
        }
        Arrays.sort(str);
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        return answer;
    }
}