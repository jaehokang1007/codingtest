class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int start = my_string.length() - n; // 시작할 부분 변수 선언
        for(int i = start; i < my_string.length(); i++){ // 문자열 돌기
            char a = my_string.charAt(i); // 한 글자씩 받기
            answer += a; // answser에 더하기
        }
        return answer;
    }
}