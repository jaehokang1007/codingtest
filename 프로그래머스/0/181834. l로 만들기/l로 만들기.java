class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) > 'l') answer += myString.charAt(i);
            else answer += "l";
        }
        return answer;
    }
}