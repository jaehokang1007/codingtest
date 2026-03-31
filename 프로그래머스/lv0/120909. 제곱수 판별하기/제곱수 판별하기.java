class Solution {
    public int solution(int n) {
        
        int answer = 2;
        
        for(int i = n; i >= 0; i--){
            if(i * i == n){
                answer = 1;
            }
            else i--;
        }
        
        return answer;
    }
}