package Codeup.greedy.c3301;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt=0;

        while (N >= 50000) {
            cnt++;
            N -= 50000;
        } while (N >= 10000) {
            cnt++;
            N -= 10000;
        }while (N >= 5000) {
            cnt++;
            N -= 5000;
        } while (N >= 1000) {
            cnt++;
            N -= 1000;
        } while (N >= 500) {
            cnt++;
            N -= 500;
        } while (N >= 100) {
            cnt++;
            N -= 100;
        } while (N >= 50) {
            cnt++;
            N -= 50;
        } while (N >= 10) {
            cnt++;
            N -= 10;
        }
        System.out.print(cnt);
    }
}
