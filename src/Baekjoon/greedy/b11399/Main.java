package Baekjoon.greedy.b11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] pi = new int[N];
        int sum=0;
        int result=0;

        for (int i = 0; i < N; i++) {
            pi[i] = sc.nextInt();
        }

        Arrays.sort(pi);

        for (int i = 0; i < pi.length;i++) {
            sum += pi[i];
            result+=sum;
        }
        System.out.print(result);
    }
}
