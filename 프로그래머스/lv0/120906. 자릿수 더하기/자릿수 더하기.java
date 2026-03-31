class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        while(n > 0){
            answer += n % 10; // n을 10으로 나눈 나머지를 answer에 더하고
            n /= 10; // n를 10으로 나눈 몫을 n에 다시 대입
        }
        
        return answer;
    }
}