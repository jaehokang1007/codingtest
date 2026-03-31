class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        
        for(int i = 0; i < array.length-1; i++){ // 반복문을 이용한
            for(int j = i+1; j < array.length; j++){ // 선택정렬
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        answer = array[array.length/2]; // 배열 길이 홀수 고정이므로 나누기 2 방 리턴
        
        return answer;
    }
}