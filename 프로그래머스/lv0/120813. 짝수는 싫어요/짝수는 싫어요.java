class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int a = 0; // 변수 선언
        
        if(n % 2 == 0) answer = new int[n / 2]; // n이 짝수라면 n의 절반만큼 선언
        else answer = new int[n / 2 + 1]; // 아니라면 n의 절반에 1을 더한 길이 선언
        
        for(int i = 1; i <= n; i += 2){ // i의 초기값을 1로 선언 후 조건식이 성립하면
            answer[a] = i; // i에 2씩 증가시켜서 n보다 작거나 같을 때까지 반복
            a++;
        }
        
        return answer;
    }
}