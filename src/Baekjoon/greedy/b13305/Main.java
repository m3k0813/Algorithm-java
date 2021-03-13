package Baekjoon.greedy.b13305;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] l = new long[N-1];
        long[] price = new long[N];
        long result=0;


        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }


        long min = price[0];

        for (int i = 0; i < N-1; i++) {
            if (min > price[i]) {
                min = price[i];
            }
            result += min * l[i];
        }

        System.out.print(result);

    }
}


