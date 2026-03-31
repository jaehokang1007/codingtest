import java.util.Arrays;
class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        int j = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int[] C = new int[B.length];
        for (int i = B.length-1; i >= 0; i--) {
            C[j] = B[i];
            j++;
        }
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * C[i];
        }
        return answer;
    }
}