package B_조건문.d_사분면_14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        xy(sc.nextInt(), sc.nextInt());

        sc.close();

    }


    public static void xy(int a, int b) {
        if (a > 0 && b > 0){ 
            System.out.println("1");
        } else if (a < 0 && b > 0){
            System.out.println("2"); 
        } else if (a < 0 && b < 0) {
            System.out.println("3");
        } else if (a > 0 && b < 0) {
            System.out.println("4");
        }
}
}

// 예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

// 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.