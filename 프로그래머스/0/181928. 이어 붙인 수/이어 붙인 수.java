class Solution {
    public int solution(int[] num_list) {
        
        int Even = 0; // 짝수
        int Odd = 0; // 홀수
        int Even_a = 1; // 짝수에 곱할 변수
        int Odd_a = 1; // 홀수에 곱할 변수
        
        for(int i = num_list.length-1; i >= 0; i--){ // 1의 자리부터 대입하기 위해
            if(num_list[i] % 2 == 0){ // 거꾸로 배열 돌기
                Even += num_list[i] * Even_a; // 짝수라면 Even에 더하고 곱하고
                Even_a *= 10; // Even_a에 10 곱하기
            }
            else{ // 아니라면 Odd에 홀수 더하고 Odd_a 곱하고
                Odd += num_list[i] * Odd_a; // 더하고 대입
                Odd_a *= 10; // Odd_a에 10 곱하기
            }
        }
        
        int answer = Even + Odd;
        
        return answer;
    }
}