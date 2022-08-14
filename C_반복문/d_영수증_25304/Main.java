package C_반복문.d_영수증_25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalprice =  (sc.nextInt());
        int numberof = (sc.nextInt());

        sc.close();

        for (int i = 0; i <= numberof; i++) {
            Scanner scc = new Scanner(System.in);

            product (sc.nextInt(), sc.nextInt());

            sc.close();

        }

    }

    private static void product(int nextInt, int nextInt2) {
    }
}
// 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.

// 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.

// 이후 $N$개의 줄에는 각 물건의 가격 $a$와 개수 $b$가 공백을 사이에 두고 주어진다.

// 출력
// 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.