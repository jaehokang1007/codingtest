class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2]; // 최대공약수와 최대공배수를 받을 배열 선언
        int rn = n * m;
        for(int i = 1; i <= rn; i++){
            if(n % i == 0 && m % i == 0){
                answer[0] = i; // n과 m이 둘 다 나뉘는 최대공약수를 구한 후
                answer[1] = n * m / i; // n과 m과 최대공약수를 곱해 최소공배수 구하기
            }
        }
        return answer;
    }
}