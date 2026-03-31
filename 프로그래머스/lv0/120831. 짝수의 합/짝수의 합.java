class Solution {
    public int solution(int n) {
        int answer = 0; // 최종 출력할 변수 선언
        
        // n 이하의 짝수라면 0부터 2씩 증가시키는 코드
        for(int i = 0; i <= n; i += 2){
            answer += i; // answer에 2,4,6,8...을 모두 더한 값을 대입
        }
        return answer;
    }
}