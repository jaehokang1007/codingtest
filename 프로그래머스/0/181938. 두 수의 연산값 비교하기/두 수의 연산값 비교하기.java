class Solution {
    public int solution(int a, int b) {
        String A = Integer.toString(a) + Integer.toString(b);
        int intA = Integer.parseInt(A);
        int B = 2 * a * b;
        int answer = intA > B ? intA : B;
        return answer;
    }
}