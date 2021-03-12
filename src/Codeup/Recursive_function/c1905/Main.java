package Codeup.Recursive_function.c1905;

import java.util.Scanner;

public class Main {

    public static int N;
    public static int i=1;
    public static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        count(N);
        System.out.print(result);

    }

    public static void count(int n) {

        if (0 == n) {
            return;
        }

        result += n;
        count(n-1);

    }
}
