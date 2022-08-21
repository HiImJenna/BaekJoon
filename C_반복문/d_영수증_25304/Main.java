package C_반복문.d_영수증_25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt(); // 초기 총 금액
        int receipt_length = sc.nextInt(); // 영수증 갯수 지정
        int receipt_result = 0; // 영수증 총 더한값 초기화
        int[] arr = new int[receipt_length]; // 영수증 곱한값들 배열로 정리

        //영수증 갯수 지정받은만큼 값&갯수 입력하여 결과값을 배열로 지정해주기
        for (int i = 0; i < receipt_length; i++) {
            arr[i] = receipt(sc.nextInt(), sc.nextInt());
        }

        //배열 지정한것끼리 더해주기
        for (int j = 0; j < arr.length; j++) {
            receipt_result += arr[j];
        }

        //초기 총 금액과 모두 더한것이 맞으면 Yes or No 출력하기
        if (total == receipt_result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        sc.close();
    }

    //두개 곱해주기
    public static int receipt(int a, int b) {

       int result = a * b;
       return result;
    }
}
    
// 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.

// 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.

// 이후 $N$개의 줄에는 각 물건의 가격 $a$와 개수 $b$가 공백을 사이에 두고 주어진다.

// 출력
// 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.