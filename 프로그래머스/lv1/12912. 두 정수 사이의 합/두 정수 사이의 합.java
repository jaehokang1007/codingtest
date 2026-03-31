class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a < b){
            for(int i = a; i <= b; i++){
                answer += i; // b가 a보다 큰 경우 a부터 b까지 더하는 반복문
            }
        }
        else if(a == b){
            answer = a; // a와 b가 같은 경우 a를 출력하는 코드
        }
        else{
            for(int i = b; i <= a; i++){
                answer += i; // a가 b보다 큰 경우 b부터 a까지 더하는 반복문
            }
        }
        return answer;
    }
}