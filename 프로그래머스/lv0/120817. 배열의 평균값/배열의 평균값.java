class Solution {
    public double solution(int[] numbers) {
        double answer = 0; // 최종 출력할 변수 선언
        
        // numbers 배열보다 작을 경우에 i를 1씩 증가시키고, 조건문에 걸릴 때까지
        //answer에 배열 0번부터 n번까지 더한 것을 대입
        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
        }
        
        // 배열 안에 있는 값을 모두 더한 answer를 배열의 길이로 나누어 평균 출력
        return answer / numbers.length;
    }
}