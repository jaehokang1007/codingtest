class Solution {
    public int solution(int hp) {
        
        int answer = 0;
        
        while(hp > 4){
            hp -= 5;
            answer++;
        }
        
        while(hp > 2){
            hp -= 3;
            answer++;
        }
        
        while(hp > 0){
            hp -= 1;
            answer++;
        }
        
        return answer;
        
    }
}