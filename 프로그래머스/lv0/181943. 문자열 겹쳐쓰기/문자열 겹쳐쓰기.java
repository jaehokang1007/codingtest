class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] arr1 = my_string.split("");
        String[] arr2 = overwrite_string.split("");
        for (int i = 0; i < arr1.length; i++) {
            if (i >= s && i < s + arr2.length) answer += arr2[i-s];
            else answer += arr1[i];
        }
        return answer;
    }
}