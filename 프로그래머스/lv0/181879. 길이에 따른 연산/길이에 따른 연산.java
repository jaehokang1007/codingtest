class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int one = 1; // 곱할 때 필요한 1 변수 선언
        if(num_list.length >= 11){ // 배열의 길이가 11 이상이라면
            for(int i = 0; i < num_list.length; i++){
                answer += num_list[i]; // 배열 끝까지 더하기
            }
        }
        else{ // 아니면 1에 배열 끝까지 계속 곱한 후
            for(int i = 0; i < num_list.length; i++){
                one *= num_list[i];
                answer = one; // answer에 값 대입
            }
        }
        return answer;
    }
}