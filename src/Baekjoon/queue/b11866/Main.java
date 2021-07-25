package Baekjoon.queue.b11866;


import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        System.out.print("<");
        while (q.size()>1) {
            for (int i = 0; i < K - 1; i++) {
                int tmp = q.poll();
                q.offer(tmp);
            }
            System.out.print(q.poll()+", ");
        }

        System.out.print(q.poll()+">");

    }
}
