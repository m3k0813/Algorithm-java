package Codeup.greedy.c2001;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] pasta = new double[3];
        double[] juice = new double[2];

        for (int i = 0; i < pasta.length; i++) {
            pasta[i] = sc.nextInt();
        }

        for (int i = 0; i < juice.length; i++) {
            juice[i] = sc.nextInt();
        }

        Arrays.sort(pasta);
        Arrays.sort(juice);

        double sum = ((pasta[0] + juice[0])*10)/100;


        System.out.print(pasta[0]+ juice[0] + sum);

    }
}
