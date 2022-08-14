package A_입출력과사칙연산.g_세자리수곱하기_2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        result (sc.nextInt(), sc.nextInt());

        sc.close();

        }

        public static void result (int a, int b){
            // * 일의자리수
            int third = a * (b - (((b / 100) * 100) + ((b - (b / 100) * 100) / 10 ) * 10 ));

            // * 십의 자리 수
            int fourth = a * ((b - (b / 100) * 100) / 10);

            // * 백의 자리 수
            int fifth = a * (b / 100);

            //결과
            int sixth =  a * b;

            System.out.println(third);
            System.out.println(fourth);
            System.out.println(fifth);
            System.out.println(sixth);
        }
    }


    // (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

    // 입력
    // 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
    
    // 출력
    // 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.