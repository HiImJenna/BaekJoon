package 조건문.e_알람시계_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        time (sc.nextInt(), sc.nextInt());

        sc.close();

    }
        public static void time(int a, int b){
            if (b >= 45){
               System.out.print(a + " ");
               System.out.print(b - 45);
            } else if ( a == 0 && b < 45){
                System.out.print(24 - 1);
                int d = 45 - b;
                System.out.print(" " + (60 - d));
            }  else if ( b < 45 ){
                System.out.print(a - 1 + " ");
                int c = 45 - b;
                System.out.print(60 - c);
            }
        }
}
           

// 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 
// 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.

// 입력 시간은 24시간 표현을 사용한다. 
// 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 
// 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
