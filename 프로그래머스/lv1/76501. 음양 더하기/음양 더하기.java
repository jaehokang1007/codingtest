class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < signs.length; i++){ // signs 배열을 끝까지 도는 포문
            if(signs[i] == true) answer += absolutes[i]; // 양수이면 answer에 더하기
                else if(signs[i] == false) answer -= absolutes[i]; // 음수이면 빼기
        }
        return answer;
    }
}