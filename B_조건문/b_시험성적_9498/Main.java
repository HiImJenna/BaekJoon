package 조건문.b_시험성적_9498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        score(sc.nextInt());

        sc.close();
    }

    public static void score (int a){
        if (a >= 60 && a <= 69){
            System.out.println("D");
        } else if(a >= 70 && a<= 79){
            System.out.println("C");
        } else if (a >= 80 && a <= 89){
            System.out.println("B");
        } else if (a >= 90 && a <= 100) {
            System.out.println("A");
        } else {
            System.out.println("F");
        }
    }

}

// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
