package Baekjoon.greedy.b11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int length = 0;
        int cnt=0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = arr.length-1; i >= 0; i--) {

            if (k >= arr[i]) {
                while (k >= arr[i]) {
                    k-=arr[i];
                    cnt++;
                }

            }else{
                continue;
            }
        }

        System.out.print(cnt);
    }
}
