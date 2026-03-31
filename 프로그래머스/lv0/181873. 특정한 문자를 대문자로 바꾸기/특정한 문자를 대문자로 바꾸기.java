class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] str = my_string.split("");
        for (int i = 0; i < str.length; i++) {
            if (alp.equals(str[i])) {
                str[i] = str[i].toUpperCase();
            }
        }
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        return answer;
    }
}