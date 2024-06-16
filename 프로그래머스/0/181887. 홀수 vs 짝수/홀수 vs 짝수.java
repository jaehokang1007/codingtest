class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int Even = 0; // 짝수 번째 원소들의 합을 대입할 변수
        int Odd = 0; // 홀수 번째 원소들의 합을 대입할 변수
        for(int i = 0; i < num_list.length; i += 2){
            Odd += num_list[i]; // 홀수 번째 원소들의 합을 Odd에 대입
        }
        for(int j = 1; j < num_list.length; j += 2){
            Even += num_list[j]; // 짝수 번째 원소들의 합을 Even에 대입
        }
        if(Odd > Even) answer = Odd; // 홀수 번째 원소들의 합이 크다면 Odd 리턴
        else if(Odd == Even) answer = Odd; // 같다면 아무거나 리턴
        else answer = Even; // 둘 다 아니라면 Even 리턴
        return answer;
    }
}