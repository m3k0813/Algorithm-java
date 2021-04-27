package Programmers.level1.문자열내림차순으로배치하기;

import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];
        arr = s.split("");
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0;i--){
            answer += arr[i];
        }
        return answer;
    }
}