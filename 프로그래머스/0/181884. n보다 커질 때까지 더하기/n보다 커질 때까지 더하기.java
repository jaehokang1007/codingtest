class Solution {
    public int solution(int[] numbers, int n) {
        
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++){ // 배열 돌면서
            answer += numbers[i];
            if(answer > n) break; // n보다 커지는 순간 멈추기
        }
        
        return answer;
    }
}