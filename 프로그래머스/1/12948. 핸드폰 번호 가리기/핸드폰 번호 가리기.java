class Solution {
    public String solution(String phone_number) {
        
        String answer = "";
        char ch = '0';
        
        for(int i = 0; i < phone_number.length(); i++){
            ch = phone_number.charAt(i);
            if(i + 4 >= phone_number.length()){
                answer += ch;
            }
            else{
            answer += '*';
            }
        }
        
        return answer;
    }
}