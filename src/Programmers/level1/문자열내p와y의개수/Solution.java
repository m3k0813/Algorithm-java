package Programmers.level1.문자열내p와y의개수;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt=0, ycnt=0;
        char[] arr = new char[s.length()];

        for(int i=0; i<s.length();i++){
            arr[i] = s.charAt(i);
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]=='p' || arr[i]=='P'){
                pcnt++;
            }
            if(arr[i]=='y' || arr[i]=='Y'){
                ycnt++;
            }
            if(pcnt==ycnt){
                answer = true;
            }else{
                answer = false;
            }
        }
        return answer;
    }
}


