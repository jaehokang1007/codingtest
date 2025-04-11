class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num = 0;
        int str = 0;
        num = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        str = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        if (num > str) answer = num;
        else answer = str;
        return answer;
    }
}