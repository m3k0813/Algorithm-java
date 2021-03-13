package Codeup.Recursive_function.c1915;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print(fibo(N));
        }

    public static int fibo(int a) {

        if (a == 1) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }

        return fibo(a-1) + fibo(a-2);
    }
}
