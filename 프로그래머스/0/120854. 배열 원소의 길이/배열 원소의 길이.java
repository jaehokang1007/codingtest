class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; // strlist 길이의 배열 선언
        for(int i = 0; i < strlist.length; i++){ // answer[i]에
            answer[i] = strlist[i].length(); // strlist[i]의 길이 대입
        }
        return answer;
    }
}