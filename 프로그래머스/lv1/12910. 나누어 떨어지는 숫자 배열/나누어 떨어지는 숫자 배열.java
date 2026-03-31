import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] answer = {};
        int count = 0; // 나눠 떨어질 배열 셀 변수
        int a = 0; // 따로 증가시킬 배열 번호
        
        Arrays.sort(arr); // 배열 정렬
        
        for(int i = 0; i < arr.length; i++){ // 나눠떨어지는 갯수 세기
            if(arr[i] % divisor == 0) count++;
        }
        
        answer = new int[count]; // 센 만큼 배열 만들기
        
        if(count == 0){ // 하나도 안 나눠 떨어진다면 -1 리턴
            answer = new int[1];
            answer[0] = -1;
        }
        
        for(int i = 0; i < arr.length; i++){ // 나눠 떨어진다면 리턴할 배열에
            if(arr[i] % divisor == 0){ // 나눠떨어지는거 대입
                answer[a] = arr[i];
                a++; // 증가
            }
            if(a == count) break; // a가 센 수가 되면 멈추기
        }
        
        return answer;
    }
}