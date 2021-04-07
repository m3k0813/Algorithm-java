package Programmers.level1.x만간격이있n개의숫자;

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long a = x;
        for(int i=0; i<n; i++){
            answer[i] = x;
            x += a;
        }
        return answer;
    }
}