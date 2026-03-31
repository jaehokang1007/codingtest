class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // 출력할 배열 선언
        for(int i = 0; i < numbers.length; i++){ // 배열 돌면서 n번방에 곱 2
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}