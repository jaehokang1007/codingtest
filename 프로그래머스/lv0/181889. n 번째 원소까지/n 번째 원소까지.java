class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] answer = new int[n]; // n만큼의 길이의 배열 선언
        
        for(int i = 0; i < answer.length; i++){ // answer 길이까지 돌면서 대입
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}