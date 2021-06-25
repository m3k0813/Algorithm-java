package Baekjoon.stack.b4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (vps(s) == 1) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    public static int vps(String s){

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i)=='[') {
                st.push(s.charAt(i));
            }else if(s.charAt(i) == ')' || s.charAt(i)==']'){
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