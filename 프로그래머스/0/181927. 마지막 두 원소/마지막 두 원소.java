class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1]; // 최종 출력할 배열 선언
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i]; // 선언한 배열에 마지막 원소 제외하고 값 대입
        }
        int a = num_list[num_list.length-1]; // 코드 짧게 마지막 원소를 변수로 선언
        int b = num_list[num_list.length-2]; // 마지막 원소의 전 원소를 선언
        if(a > b) answer[answer.length-1] = a - b; // a가 b보다 작다면 a-b
        else answer[answer.length-1] = a * 2; // 아니라면 a*2
        return answer;
    }
}