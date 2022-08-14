package A_입출력과사칙연산.f_나머지_10430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
         
        result(sc.nextInt(), sc.nextInt(), sc.nextInt());

        sc.close();
    }
    
    public static void result (int a, int b, int c) {

        int first = (a + b) % c ;
        int second = ((a % c) + (b % c)) % c;
        int third = (a * b) % c;
        int fourth = ((a % c) * (b % c)) % c;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}

//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.