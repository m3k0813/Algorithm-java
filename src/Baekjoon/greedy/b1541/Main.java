package Baekjoon.greedy.b1541;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = Integer.MAX_VALUE;
        String st = sc.nextLine();
        String[] sub = st.split("-");


        for(int i = 0; i < sub.length; i++) {
            int temp = 0;

            String[] add = sub[i].split("\\+");

            for(String val : add) {
                temp += Integer.parseInt(val);
            }


            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);
    }
}

