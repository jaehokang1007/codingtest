class Solution {
    public int[] solution(int n, int s) {
        int a = s / n;
        int b = s % n;
        if (a == 0){
            return new int[]{-1};
        }
        int[] answer = new int[n];
        for(int i = answer.length-1; i >= 0;i--){            
            answer[i] = a;
            if(b > 0){
                answer[i]++;
                b--;
            }
        }

        return answer;
    }
}