package Programmers.level1.최대공약와최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int Max = euclidean(n, m);

        answer[0] = Max;
        answer[1] = n * m / Max;

        return answer;
    }
    // 유클리드 호제법
    public int euclidean(int n,int m){

        if(n%m==0){
            return m;
        }
        int a = n % m;
        return euclidean(m, a);
    }
}