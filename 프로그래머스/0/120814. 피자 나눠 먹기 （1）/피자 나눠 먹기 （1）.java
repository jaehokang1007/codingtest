class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 7 == 0) answer = n / 7; // 남는 피자가 없는 경우
        else if(n % 7 != 0) answer = n / 7 + 1; // 남는 피자가 있는 경우
        else if(n < 7) answer = 1; // 먹는 사람이 피자 수보다 적은 경우
        return answer;
    }
}