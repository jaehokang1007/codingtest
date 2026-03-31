class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1]; // 불러올 배열 선언
        int j = 0; // 0부터 증가시킬 변수 선언
        for(int i = num1; i <= num2; i++){ // 넘1부터 넘2까지 배열 돌기
            answer[j++] = numbers[i]; // answer 0번방부터 number의 num1부터 1씩
        } // 늘리면서 대입
        return answer;
    }
}