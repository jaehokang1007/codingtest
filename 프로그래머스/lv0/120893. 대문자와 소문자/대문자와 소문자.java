class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){ // my_string 문자열 돌기
            char a = my_string.charAt(i); // 한 글자씩 보기
            if(Character.isLowerCase(a)){ // 소문자라면 answer에 대문자로 넣기
                answer += Character.toUpperCase(a);
            } else{ // 아니라면 answer에 소문자로 넣기
                answer += Character.toLowerCase(a);
            }
        }
        return answer;
    }
}