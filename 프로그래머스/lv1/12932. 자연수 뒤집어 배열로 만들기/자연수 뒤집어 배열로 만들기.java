class Solution {
    public int[] solution(long n) {
        
        int[] answer = {};
        long n2 = n; // n이랑 같은 변수 선언
        int count = 0; // 자릿수 구별할 변수 선언
        
        while(n > 0){
            n /= 10; // 10으로 나눠지면
            count++; // count에 1 더하기
        }
        
        answer = new int[count]; // count된 만큼 배열길이 선언
        
        for(int i = 0; i < answer.length; i++){ // 끝자리부터 나머지를 0번방부터 대입
            answer[i] = (int)(n2 % 10);
            n2 /= 10;
        }
        
        return answer;
    }
}