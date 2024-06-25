class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int count = 0; // 배수의 개수를 셀 변수 선언
        
        for(int i = 0; i < numlist.length; i++){ // 배열 안에 수가 나눠떨어지면
            if(numlist[i] % n == 0) count++; // 카운트 증가
        }
        
        int[] answer = new int[count]; // 카운트 한 만큼의 길이 변수 선언
        int a = 0; // 배열 방 번호 따로 증가시킬 변수 선언
        
        for(int i = 0; i < numlist.length; i++){ // 나눠떨어지면 0번부터
            if(numlist[i] % n == 0){ // 차례대로 대입
                answer[a] = numlist[i];
                a++;
            }
        }
        
        return answer;
    }
}