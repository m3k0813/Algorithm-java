package Codeup.Recursive_function.c1912;

import java.util.Scanner;

public class Main {

    public static int N;
    public static int result=1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        factorial(N);
        System.out.print(result);

    }

    public static void factorial(int n) {

        if (0 == n) {
            return;
        }

        result *= n;
        factorial(n-1);

    }
}
