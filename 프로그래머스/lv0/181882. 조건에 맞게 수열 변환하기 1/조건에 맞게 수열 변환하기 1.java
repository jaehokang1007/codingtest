class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < answer.length; i++){
            // 50이상 짝수라면 나누기 2
            if(arr[i] >= 50 && arr[i] % 2 == 0) answer[i] = arr[i] / 2;
            // 50미만 홀수라면 곱하기 2
            else if(arr[i] < 50 && arr[i] % 2 != 0) answer[i] = arr[i] * 2;
            // 둘 다 아니라면 그대로 대입
            else answer[i] = arr[i];
        }
        
        return answer;
    }
}