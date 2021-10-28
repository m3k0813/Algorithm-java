package Programmers.level1.자연수뒤집배열로만들기;

import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer;
        String st = String.valueOf(n);
        String[] stArr = st.split("");
        answer = new int[stArr.length];

        int j=0;
        for(int i=stArr.length-1; i>=0; i--){
            answer[j++] = Integer.parseInt(stArr[i]);
        }
        return answer;
    }
}