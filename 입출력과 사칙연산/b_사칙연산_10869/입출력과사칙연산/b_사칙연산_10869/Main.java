package 입출력과사칙연산.b_사칙연산_10869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        result(first, second);

        sc.close();
    }

    public static void result(int a, int b){
    int plus = a + b;
    int minus = a - b;
    int times = a * b;
    int devide = a / b;
    int remainder = a % b;

    System.out.println(plus);
    System.out.println(minus);
    System.out.println(times);
    System.out.println(devide);
    System.out.println(remainder);

    }

}
