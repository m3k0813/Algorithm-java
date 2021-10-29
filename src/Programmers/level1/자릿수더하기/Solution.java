package Programmers.level1.자릿수더하기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String st = String.valueOf(n);
        String[] stArr = st.split("");

        for(int i=0; i<stArr.length; i++){
            answer = answer + Integer.parseInt(stArr[i]);
        }

        return answer;
    }
}