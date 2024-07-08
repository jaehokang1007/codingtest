class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] answer = new int[1];
        int a = 0;
        // n으로 나눠떨어지면 나눈 몫만큼 아니라면 나눈 몫에 더하기 1 한 만큼 배열 선언
        if(num_list.length % n == 0) answer = new int[num_list.length/n];
        else answer = new int[num_list.length/n+1];
        
        for(int i = 0; i < answer.length; i++){ // 배열 다 돌면서 a를 0부터 n만큼
            answer[i] = num_list[a];
            a += n; // 증가시키기
        }
        
        return answer;
    }
}