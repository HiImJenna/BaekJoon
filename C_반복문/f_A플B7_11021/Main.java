package C_반복문.f_A플B7_11021;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int amount = sc.nextInt();
     
    for (int i = 0; i < amount; i++) {
        int result = plus (sc.nextInt(), sc.nextInt());
        System.out.println("Case #" + (i+1) + ": " + result);
    }

     sc.close();

}

public static int plus(int a, int b){
    int result = a + b;

    return result;
    }
}
