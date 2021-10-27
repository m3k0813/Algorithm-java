package Programmers.level1.정수내림차순으로배치하기;

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "";
        String st = String.valueOf(n);
        String[] stArr = st.split("");
        Arrays.sort(stArr, Collections.reverseOrder());

        for(int i=0; i<stArr.length; i++){
            s = s +stArr[i];
            answer = Long.valueOf(s);
        }
        return answer;
    }
}