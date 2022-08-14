package A_입출력과사칙연산.e_체스_3003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        count (sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        sc.close();
    }

    public static void count(int a, int b, int c, int d, int e, int f) {
        int king = 1 - a;
        int queen = 1 - b;
        int look = 2 - c;
        int bishop = 2 - d;
        int knight = 2 - e;
        int pawn = 8 - f;

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(look + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn + " ");
    }
}

//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개