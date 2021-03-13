package Baekjoon.Programmers.level1.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        int result =0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result = numbers[i] + numbers[j];
                if (!list.contains(result)) {       //contains boolean값 리턴
                    list.add(result);
                }
            }
        }


        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }

        Arrays.sort(answer);
        return answer;

    }
}
