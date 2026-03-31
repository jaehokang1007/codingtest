import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0){ // n이 0보다 클 동안
            answer += n % 10; // answer에 n을 10으로 나눠서 남은 나머지를 더함
            n /= 10; // n을 10으로 나눈 것을 n에 다시 대입
        }
        
        return answer;
    }
}