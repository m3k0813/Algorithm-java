package Baekjoon.stack.b10773;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> stack = new ArrayList<Integer>();
        int top = -1;
        int sum=0;

        for(int i=0; i<k; i++){
            int a = sc.nextInt();

            if (a != 0) {
                top++;
                stack.add(a);
            }else{
                stack.remove(top);
                top--;
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        System.out.println(sum);
    }
}
