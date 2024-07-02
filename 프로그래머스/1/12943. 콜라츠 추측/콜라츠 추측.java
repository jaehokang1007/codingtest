class Solution {
    public int solution(long num) {
        
        int answer = 0;
        
        while(num != 1){ // num이 1이 아닐동안
            
            if(num % 2 == 0){ // 짝수라면
                num /= 2; // num 2로 나누고 대입
            }
            
            else{ // 짝수 아니라면
                num = num * 3 + 1; // 곱3 더하기 1
            }
            
            answer++; // 횟수 증가
            
            if(answer >= 500){ // answer가 500이랑 같거나 커지면 answer -1 대입
                answer = -1;
                break; // 중단
            }
        }
        
        return answer;
    }
}