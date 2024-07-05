class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0; // 같은지 확인할 변수
        char op = 0; // 문자열 쪼갤 캐릭터 선언
        
        for(int i = 0; i < s.length(); i++){ // s를 다 돌면서
            op = s.charAt(i); // s 한 글짜 따서 p거나 y이면 더하거나 빼기
            if(op == 'p' || op == 'P') count++;
            else if(op == 'y' || op == 'Y') count--;
        }
        
        if(count != 0) answer = false; // 0이 아니면 거짓

        return answer;
    }
}