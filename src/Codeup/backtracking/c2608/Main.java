package Codeup.backtracking.c2608;

import java.util.Scanner;

public class Main {

        public static int N;
        public static char[] arr;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            arr = new char[N];

            dfs(N,0);
        }

        public static void dfs(int n, int d) {
            if (d == n) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
              System.out.println();
                return;
            }

            arr[d] = 'O';
            dfs(n, d+1);
            arr[d] = 'X';
            dfs(n, d + 1);
        }

}

