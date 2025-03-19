import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int plus;
        int minus;
        Arrays.sort(numbers);
        plus = numbers[numbers.length-1] * numbers[numbers.length-2];
        minus = numbers[0] * numbers[1];
        if (plus > minus) answer = plus;
        else answer = minus;
        return answer;
    }
}