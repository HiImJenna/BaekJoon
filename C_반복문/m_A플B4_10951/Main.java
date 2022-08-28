package C_반복문.m_A플B4_10951;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        add(sc.nextInt(), sc.nextInt());
    }

    private static void add(int a, int b) {
        while (true) {
        int c = a + b;
        if(c != 0 ) {
            System.out.println(c);
        }

    }
}
}
