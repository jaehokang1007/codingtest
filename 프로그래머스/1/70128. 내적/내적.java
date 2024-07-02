class Solution {
    public int solution(int[] a, int[] b) {
        
        int answer = 0;
        
        for(int i = 0; i < a.length; i++){ // answer에 a와 b의 내적 더하기
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}