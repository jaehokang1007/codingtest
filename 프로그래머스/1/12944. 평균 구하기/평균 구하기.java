class Solution {
    public double solution(int[] arr) {
        double answer = 0; // 불러올 변수 선언
        
        // 배열 안에 수를 i로 선언 후, 배열 0번부터 n번까지 있는 수의 합을 구하는 반복문
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer / arr.length; // 모든 수의 합을 배열의 길이로 나눈 평균값
    }
}