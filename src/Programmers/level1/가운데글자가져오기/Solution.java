package Programmers.level1.가운데글자가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];
        arr = s.split("");

        if(s.length()%2!=0){
            answer = arr[s.length()/2];
        }else{
            answer =arr[s.length()/2-1] + arr[s.length()/2];
        }
        return answer;
    }
}