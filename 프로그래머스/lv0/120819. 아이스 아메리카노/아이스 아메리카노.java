class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2]; // 잔 수와 잔돈을 담을 배열 선언
        answer[0] = money / 5500; // 가지고 있는 돈 나누기 5500원을 0번방에 대입
        answer[1] = money % 5500; // 가지고 있는 돈 나누기 5500의 나머지를 1번에 대입
        return answer;
    }
}