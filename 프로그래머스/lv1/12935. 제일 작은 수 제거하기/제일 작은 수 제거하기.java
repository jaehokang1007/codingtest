import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length-1]; // 배열 제거 해서 남은 배열 선언
        int[] arr2 = new int[arr.length]; // 정렬해서 풀면 안되서 똑같은 배열 선언
        int min = 0; // 배열의 최솟값 저장할 변수 선언
        int a = 0; // 방 번호 따로 증가시킬 변수 선언
        
        for(int i = 0; i < arr2.length; i++){ // 배열 요소까지 복사
            arr2[i] = arr[i];
        }
        
        Arrays.sort(arr2); // 복사한 배열 정렬
        
        min = arr2[0]; // 0번방의 값을 최솟값에 대입
        
        for(int i = 0; i < answer.length; i++){ // 최솟값과 arr의 a번방의 수가
            if(arr[a] == min) a++; // 같다면 패스
            answer[i] = arr[a];
            a++;
        }
        
        if(arr.length == 1){ // 비교할 값이 없으면 -1 리턴
            answer = new int[1];
            answer[0] = -1;
        }
            
        return answer;
    }
}