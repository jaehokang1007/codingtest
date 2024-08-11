class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] answer = new int[num_list.length];
        
        if(num_list.length == n) return num_list;
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[n];
            if(n == num_list.length-1){
                n = 0;
            }
            else{
                n++;
            }
        }
        
        return answer;
    }
}