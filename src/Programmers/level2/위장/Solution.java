package Programmers.level2.위장;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int cnt=0;

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        // 해시맵에 종류와 개수를 저장
        for(int i=0; i<clothes.length; i++){

            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1],map.get(clothes[i][1])+1);
            }else{
                map.put(clothes[i][1],1);
            }
        }

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            cnt = value+1;          // 의상을 입지 않는 경우도 더해줌
            answer = answer*cnt;
        }
        return answer-1;       // 의상을 모두 입지 않는 경우를 뺌
    }
}