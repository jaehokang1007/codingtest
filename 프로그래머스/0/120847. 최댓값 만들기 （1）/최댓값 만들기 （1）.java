import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // 배열 오름차순 정렬
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        // answer에 배열 끝에 두개 곱한 수 대입
        return answer;
    }
}