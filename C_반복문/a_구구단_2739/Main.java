package C_반복문.a_구구단_2739;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        timestable(sc.nextInt());

        sc.close();

    }

    public static void timestable(int a){
        for (int j = 1; j <= 9; j++) {
            System.out.println(a + " * " + j + " = " + (a * j));
        }
    }
}

// 출력형식과 같게 N*1부터 N*9까지 출력한다.
// 2 * 1 = 2