import java.util.*;
class Solution {
    public int solution(int[] sides) {
        
        int answer = 0;
        Arrays.sort(sides); // 배열 정렬
        
        if(sides[2] >= sides[0]+sides[1]) answer = 2;
        else answer = 1;
        
        return answer;
    }
}