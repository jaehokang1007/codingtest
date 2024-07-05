import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length-1];
        int[] arr2 = new int[arr.length];
        int min = 0;
        int a = 0;
        
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[i];
        }
        
        Arrays.sort(arr2);
        
        min = arr2[0];
        
        for(int i = 0; i < answer.length; i++){
            if(arr[a] == min) a++;
            answer[i] = arr[a];
            a++;
        }
        
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }
            
        return answer;
    }
}