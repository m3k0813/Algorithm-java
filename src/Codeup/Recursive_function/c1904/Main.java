package Codeup.Recursive_function.c1904;

import java.util.Scanner;

public class Main {

    public static int a;
    public static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        count(a,b);
    }

    public static void count(int i, int j) {



        if (i % 2 != 0) {
            System.out.print(i + "\n");

        }

        if (i == j) {
            return;
        }

        i++;
        count(i,j);
    }
}
