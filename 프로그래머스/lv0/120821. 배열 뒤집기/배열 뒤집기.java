class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length]; // num_list의 길이를 가진 배열 선언
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length - i - 1];
            // 넘리스트 길이를 역으로 대입하여 거꾸로 배열을 만듬
        }
        return answer;
    }
}