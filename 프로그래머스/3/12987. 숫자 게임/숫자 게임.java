import java.util.Arrays;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            while (j < B.length && B[j] <= A[i]) {
                j++;
            }
            if (j < B.length) {
                answer++;
                j++;
            }
        }
        return answer;
    }
}