class Solution {
    public long solution(int price, int money, int count) {
        
        long answer = 0;
        long a = 0; // 필요한 돈 변수 선언
        
        for(int i = 1; i <= count; i++){ // 필요한 돈 구하기
            a += price * i;
        }
        
        if(a > money) answer = a - money; // 돈이 부족하다면 부족한만큼 리턴

        return answer;
    }
}