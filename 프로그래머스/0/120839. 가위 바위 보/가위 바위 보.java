class Solution {
    public String solution(String rsp) {
        
        String answer = "";
        String[] arr = rsp.split(""); // rsp 배열로 나누고
        
        for(int i = 0; i < arr.length; i++){ // 배열 다 회전하기
            if(arr[i].equals("2")) answer += "0"; // 2라면 0
            else if(arr[i].equals("0")) answer += "5"; // 0이라면 5
            else answer += "2"; // 아니라면 2
        }
        
        return answer;
    }
}