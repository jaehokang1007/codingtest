class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a = 0; // 각 자릿수를 더할 변수 선언
        int b = x; // x와 같은 변수 선언
        
        while(b > 0){
            a += b % 10; // b를 10으로 나눈 나머지를 a 에 더하고
            b /= 10; // b를 10으로 나눈 값을 다시 b에 대입
        }
        
        if(x % a == 0) answer = true; // x 나누기 a가 나눠떨어진다면 True
        else answer = false; // 아니라면 False
        
        return answer;
    }
}