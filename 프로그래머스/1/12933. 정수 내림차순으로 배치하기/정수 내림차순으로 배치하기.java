import java.util.*;
class Solution {
    public long solution(long n) {
        
        long answer = 0;
        int count = 0;
        long n2 = n;
        long ten = 1;
        
        while(n != 0){
            n /= 10;
            count++;
        }
        
        long arr[] = new long[count];
        n = n2;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = n % 10;
            n /= 10;
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i] * ten;
            ten *= 10;
        }
        
        return answer;
    }
}