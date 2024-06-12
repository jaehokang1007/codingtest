class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 != 0){ // 짝수가 아닐경우 1부터 n까지의 홀수 더하기
            for(int i = 1; i <= n; i += 2){
                answer += i;
            }
        }
        else
            for(int j = 2; j <= n; j += 2){ // 짝수일경우 2부터 n까지의 짝수 더하기
                answer += j * j;
        }
        return answer;
    }
}