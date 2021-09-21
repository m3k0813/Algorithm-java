package Programmers.level2.p124나라의숫자;

class Solution {
    public String solution(int n) {
        String answer = "";

        int q = n;
        int r = 0;

        while (q!=0) {
            r = q % 3;
            q = q / 3;

            if (r == 0) {
                answer = "4" + answer;
                q--;
            }
            else if (r == 1) {
                answer = "1" + answer;
            }
            else if (r == 2) {
                answer = "2" + answer;
            }
        }

        return answer;
    }
}