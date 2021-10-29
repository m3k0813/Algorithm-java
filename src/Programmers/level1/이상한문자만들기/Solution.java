package Programmers.level1.이상한문자만들기;

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stArr = s.split("");
        int cnt=0;

        for(int i=0; i<stArr.length; i++){
            if(stArr[i].equals(" ")){
                cnt = 0;
            }else{
                if(cnt%2==0){
                    cnt++;
                    stArr[i] = stArr[i].toUpperCase();
                }else{
                    cnt++;
                    stArr[i] = stArr[i].toLowerCase();
                }
            }
            answer += stArr[i];
        }
        return answer;
    }
}