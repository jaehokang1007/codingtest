class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String save1;
        String save2;
        int len = 0;
        String[] arr = my_string.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i == num1) {
                save1 = arr[i];
                len = i;
            }
            if (i == num2) {
                save2 = arr[i];
                arr[i] = arr[len];
                arr[len] = save2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}