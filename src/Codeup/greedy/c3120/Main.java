package Codeup.greedy.c3120;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.abs(b-a);
        int cnt=0;

        while (c >= 10) {
            cnt++;
            c-=10;
        }
        while (c > 7) {
            cnt++;
            c-=10;
        }

        while (c >= 5) {
            cnt++;
            c -= 5;
        }

        while (c > 3) {
            cnt++;
            c -= 5;
        }
        while (c > 0) {
            cnt++;
            c-=1;
        }
        while (true) {
            if (c == 0) {
                break;
            }else{
                cnt++;
                c += 1;
            }
        }


        System.out.print(cnt);
    }
}
