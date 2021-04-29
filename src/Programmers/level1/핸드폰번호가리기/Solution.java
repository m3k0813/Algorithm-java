package Programmers.level1.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = new String[phone_number.length()];
        arr = phone_number.split("");
        for(int i=0; i<phone_number.length()-4; i++){
            answer += "*";
        }
        for(int i=phone_number.length()-4; i<phone_number.length() ;i++){
            answer += arr[i];
        }
        System.out.println(arr);
        return answer;
    }
}