import java.util.*;
class Solution {
    public long solution(long n) {
        
        long answer = 0;
        int count = 0; // 자릿수 세는 변수
        long n2 = n; // n 변수 복사
        long ten = 1; // 자릿수마다 10 곱할 변수
        
        while(n != 0){ // 자릿수 세기
            n /= 10;
            count++;
        }
        
        long arr[] = new long[count]; // 자릿수만큼 배열 만들기
        n = n2; // n 원상복구
        
        for(int i = 0; i < arr.length; i++){ // 배열에 자릿수 전부 대입
            arr[i] = n % 10;
            n /= 10;
        }
        
        Arrays.sort(arr); // 배열 오름차순
        
        for(int i = 0; i < arr.length; i++){ // 자릿수 올라갈 때마다 10 곱하기
            answer += arr[i] * ten;
            ten *= 10;
        }
        
        return answer;
    }
}