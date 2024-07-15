class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int answer = 0;
        int array1 = 0; // arr1을 다 더한 값
        int array2 = 0; // arr2를 다 더한 값
        
        // arr1 다 더한 반복문
        for(int i = 0; i < arr1.length; i++){
            array1 += arr1[i];
        }
        // arr2 다 더한 반복문
        for(int i = 0; i < arr2.length; i++){
            array2 += arr2[i];
        }      
        
        if(arr1.length > arr2.length) answer = 1; // 길이가 1이 더 크다면 1 리턴
        else answer = -1; // 아니라면 -1 리턴
        if(arr1.length == arr2.length){ // 길이가 같다면
            if(array1 > array2) answer = 1; // 다 더해서 1이 크다면 1 리턴
            else if(array1 == array2) answer = 0; // 같다면 0 리턴
            else answer = -1; // 아니라면 -1 리턴
        }
        
        return answer;
    }
}