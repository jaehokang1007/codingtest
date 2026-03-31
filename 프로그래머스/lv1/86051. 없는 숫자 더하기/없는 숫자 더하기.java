class Solution {
    public int solution(int[] numbers) {
        
        int answer = 45; // 0부터 9까지의 합
        
        for(int i = 0; i < numbers.length; i++){ // 배열에 있는 수 빼기
            answer -= numbers[i];
        }
        
        return answer;
    }
}