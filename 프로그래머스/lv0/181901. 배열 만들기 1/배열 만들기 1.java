class Solution {
    public int[] solution(int n, int k) {
        
        int[] answer = new int[n/k]; // n 나누기 k만큼의 배열 선언
        int a = 1; // k에 곱할 변수 선언
        
        for(int i = 0; i < answer.length; i++){ // answer 배열 다 돌기
            answer[i] = k * a; // k 곱하기 a
            a++; // a 증가
        }
        
        return answer;
    }
}