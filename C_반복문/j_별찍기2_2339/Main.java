package C_반복문.j_별찍기2_2339;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int random = sc.nextInt();

    for (int i = 1; i <= random; i++) {
        //공백
        for (int j = random-1; j >= i ; j--) {
            System.out.print(" ");
        }
        //별
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
            }
            System.out.println();
        }


    }
 }