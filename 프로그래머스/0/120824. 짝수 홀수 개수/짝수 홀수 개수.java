class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; // 짝수 홀수 갯수를 출력할 배열 선언
        for(int i = 0; i < num_list.length; i++){ // 배열을 처음부터 끝까지 돌 반복문
            if(num_list[i] % 2 != 0) answer[1]++; // 홀수라면 홀수 방에 1씩 증가
            else answer[0]++; // 아니라면 짝수방에 1씩 증가
        }
        return answer;
    }
}