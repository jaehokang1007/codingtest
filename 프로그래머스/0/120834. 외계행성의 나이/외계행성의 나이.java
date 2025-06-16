class Solution {
    public String solution(int age) {
        String answer = "";
        String[] arr = Integer.toString(age).split(""); // 문자로 바꾼 후 배열로
        for (int i = 0; i < arr.length; i++) {
            answer += (char)(Integer.parseInt(arr[i]) + 97);
        } // 배열 돌면서 인덱스랑 97 더하고 아스키코드 형태로 변환
        return answer;
    }
}