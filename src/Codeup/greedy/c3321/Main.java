package Codeup.greedy.c3321;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] tcal = new int[n];

        for (int i = 0; i < n; i++) {
            tcal[i] = sc.nextInt();
        }

        int cal = c;
        int price = a;
        int tmp = c/a;

        Arrays.sort(tcal);

        for (int i = tcal.length-1; i >=0; i--) {
            if (tmp < tcal[i] / b) {
                price+=b;
                cal+=tcal[i];
                tmp=cal/price;
            }else{
                break;
            }
        }

        System.out.print(tmp);
    }
}
