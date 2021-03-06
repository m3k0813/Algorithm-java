package Codeup.stack.c2016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = sc.next();


        int a = n%3;

            for (int i = 0; i < st.length(); i++) {
                if (a == 0) {
                    a+=3;
                }

                if(a==i){
                    System.out.print(',');
                    a+=3;
                }
                System.out.print(st.charAt(i));

            }

    }
}
