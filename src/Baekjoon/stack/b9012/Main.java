package Baekjoon.stack.b9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0; i<N ; i++){
            String s = sc.next();
            if (vps(s) == 1) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static int vps(String s){

        Stack<Character> st = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }else{
                if (st.isEmpty()) {
                    return 0;
                }else{
                    st.pop();
                }
            }
        }
        if (st.isEmpty()) {
           return 1;
        }
        return 0;
    }
}

