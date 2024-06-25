class Solution {
    public int[] solution(int[] array) {
        
        int[] answer = new int[2]; // 길이 2의 배열 선언
        
        for(int i = 1; i < array.length; i++){ // 배열의 가장 큰 수와 위치 불러오기
            if(array[i-1] > array[i]){
                answer[0] = array[i-1];
                answer[1] = i-1;
            }
            else{
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        
        return answer;
    }
}