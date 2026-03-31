class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length]; // arr와 길이가 똑같은 배열 선언
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i]; // arr 배열 안에 수를 answer에 그대로 불러오기(?)
        }
        if(arr.length % 2 != 0){
            for(int j = 0; j < arr.length; j += 2){
                answer[j] += n; // 홀수라면 짝수 인덱스에 n 더하기
            }
        }
        else{
            for(int k = 1; k < arr.length; k += 2){
                answer[k] += n; // 짝수라면 홀수 인덱스에 n 더하기
            }
        }
        return answer;
    }
}