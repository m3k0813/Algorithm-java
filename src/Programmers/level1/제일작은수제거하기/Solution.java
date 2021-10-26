package Programmers.level1.제일작은수제거하기;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int Min = -1 ;
        int j=0;

        if(arr.length==1){
            answer[0] = -1;
            return answer;
        }

        Min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(Min > arr[i]){
                Min = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(Min != arr[i]){
                answer[j++] = arr[i];
            }
        }
        return answer;
    }
}