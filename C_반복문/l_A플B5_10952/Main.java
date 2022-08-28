package C_반복문.l_A플B5_10952;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int first = sc.nextInt();
             int second = sc.nextInt();
             add(first, second);
             if( first == 0 && second == 0){
                break;
             }
        }
    
    }



    public static void add (int a, int b) {
        int c = a + b;


        if (c != 0){
            System.out.println(c);
       } 
}
}
