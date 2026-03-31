import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[5]; // 배열 길이 5 선언
        
        Arrays.sort(num_list); // 배열 정렬
        
        for(int i = 0; i < answer.length; i++){ // 4번까지 차례대로 대입
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}