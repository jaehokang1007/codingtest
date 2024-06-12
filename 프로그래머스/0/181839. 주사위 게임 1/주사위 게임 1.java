class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a % 2 != 0 && b % 2 != 0) answer = (a * a) + (b * b); // 모두 홀수
        else if(a % 2 != 0 || b % 2 != 0) answer = 2 * (a + b); // 둘중 하나 홀수
        else answer = Math.abs(a - b); // 모두 홀수 아님
        return answer;
    }
}