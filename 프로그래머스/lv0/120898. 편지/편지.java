class Solution {
    public int solution(String message) {
        
        int answer = 0;
        
        for(int i = 0; i < message.length(); i++){ // 편지 한 글자마다 2씩 증가
            answer += 2;
        }
        
        return answer;
    }
}