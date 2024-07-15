class Solution {
    public String solution(String[] arr) {
        
        String answer = "";
        
        // arr의 문자를 다 담는 반복문
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}