class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0; i < seoul.length; i++){ // 서울 배열 다 돌기
            if(seoul[i].equals("Kim")){ // 서울 i번방에 kim이 있다면
                answer = "김서방은 " + i + "에 있다"; // 김서방은 어디에 있는지 출력
            }
        }
        return answer;
    }
}