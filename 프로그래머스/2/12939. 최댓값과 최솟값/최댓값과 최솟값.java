import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr1 = s.split(" ");
        int len = arr1.length;
        int[] arr2 = new int[len];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        Arrays.sort(arr2);
        return arr2[0] + " " + arr2[arr2.length-1];
    }
}