package C_반복문.h_별찍기1_2438;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int random = sc.nextInt();

        for (int i = 0; i < random; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
             System.out.println();

            sc.close();
        } 

    }
}
