class Solution {
    public int solution(int[] num_list, int n) {
        
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++){ // num_list 다 도는 배열
            if(num_list[i] == n) answer = 1; // n이랑 배열i랑 같다면 answer 증가
        }
        
        return answer;
    }
}