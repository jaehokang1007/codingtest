class Solution {
    public int solution(int[] array) {
        int max = 0; // 빈도 수
        int maxNum = 0; // 최빈값
        for (int i = 0; i < array.length; i++) {
            int compare = 0; // 비교값
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) compare++; // 같다면 비교값 증가
            }
            if (compare > max) { // 비교값이 기존 빈도 수보다 높다면
                max = compare; // 비교값을 가장 큰 빈도에 대입
                maxNum = array[i]; // 해당 배열 요소를 최빈값에 대입
            }
            // 최빈값이 여러 개면 -1을 return 합니다.
            else if (compare == max && maxNum != array[i]) maxNum = -1;
        }
        return maxNum;
    }
}