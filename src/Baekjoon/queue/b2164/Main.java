package Baekjoon.queue.b2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;
        int N = sc.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            q.remove();
            int val = q.poll();
            q.add(val);
        }
        result = q.peek();
        System.out.println(result);
    }
}
