// 두 정수 A와 B를 입력받은 다음, A + B를 출력하는 프로그램을 작성하시오. (0 < A, B < 10)

package C_반복문.m_A플B4_10951;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            add (first, second);
            }
        }

     public static void add(int a, int b){
        int c = a + b;
        System.out.println(c);
        } 
    }