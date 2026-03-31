class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){ // i를 계속 증가시키면서 n 나누기 i의 나머지가
            if(n % i == 0) answer += i; // 없을 때마다 answer에 i를 더하고 대입
        }
        return answer;
    }
}