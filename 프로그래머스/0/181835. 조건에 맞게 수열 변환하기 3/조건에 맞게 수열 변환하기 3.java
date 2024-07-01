class Solution {
    public int[] solution(int[] arr, int k) {
        
        int[] answer = new int[arr.length];
        
        if(k % 2 != 0){ // k가 홀수라면 곱하기
            for(int i = 0; i < answer.length; i++){
                answer[i] = arr[i] * k;
            }
        }
        
        else{ // k가 짝수라면 더하기
            for(int i = 0; i < answer.length; i++){
                answer[i] = arr[i] + k;
            }
        }
        
        return answer;
    }
}