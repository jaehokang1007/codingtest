class Solution {
    public long solution(long n) {
        
        long answer = 0;
        
        for(long i = 1; i <= n; i++){ // n까지 1씩 증가시키면서 제곱수면
            if(i * i == n){ // n+1 제곱 리턴하고 브레이크
                answer = (i+1) * (i+1);
                break;
            }
            else answer = -1; // 제곱수가 아니라면 -1 리턴
        }
        
        return answer;
    }
}