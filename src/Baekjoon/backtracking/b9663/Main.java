package Baekjoon.backtracking.b9663;

import java.util.Scanner;

public class Main {

    public static int N;
    public static int[] arr;
    public static int cnt = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        nQueen(0);

        System.out.print(cnt);

    }

    public static void nQueen(int d) {
        if (d == N) {
            cnt++;
            return;
        }

        //
        for (int i = 0; i < N; i++) {
            arr[d] = i;

            if (possible(d)) {
                nQueen(d + 1);
            }
        }
    }

    public static boolean possible(int c) {

        for (int i = 0; i < c; i++) {
            if (arr[i] == arr[c]) {
                return false;

            } else if (Math.abs(c - i) == Math.abs(arr[c] - arr[i])) {
                return false;
            }
        }
            return true;
        }
    }


