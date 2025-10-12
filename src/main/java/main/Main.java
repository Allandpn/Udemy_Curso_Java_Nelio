package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        System.out.println(maior);

        sc.close();
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > c) return b;
        else return c;
    }

}



