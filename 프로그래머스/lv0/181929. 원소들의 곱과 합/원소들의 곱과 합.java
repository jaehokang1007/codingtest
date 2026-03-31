class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1; // 모든 원소들의 곱
        int sum = 0; // 모든 원소들의 합의 제곱
        for(int i = 0; i < num_list.length; i++){ // 배열 안에 수를 다 더한후
            sum += num_list[i];
        }
        sum *= sum; // 다 더한 것을 제곱
        for(int j = 0; j < num_list.length; j++){ // 배열의 모든 수를 곱함
            mul *= num_list[j];
        }
        if(sum > mul) answer = 1; // sum이 mul보다 작으면 1 출력
        else answer = 0; // mul이 sum보다 작으면 0 출력
        return answer;
    }
}