package 조건문.g_주사위세개_2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        random(sc.nextInt(), sc.nextInt(), sc.nextInt());

        sc.close();
    }

    public static void random (int first, int second, int third){
        //다 같을 때
        if (first == second && first == third && second == third) { 
         System.out.println(10000 + first * 1000);
        } 

        //두개만 같을 때 
        if (first == second && second != third && first != third){ 
            System.out.println(1000 + first * 100);
        } if (second == third && third != first && second != first){ 
            System.out.println(1000 + second * 100);
        } if (first == third && third != second && first != second){ 
            System.out.println(1000 + third * 100);
        }

        // 다 다를 때
        if (first != second && second != third && first != third){  

            if (first > second && second > third && third < first) { // first > second > third
            System.out.print(first * 100); 
        }  else if (first > second && second < third && third < first) { // first > third > second
            System.out.println(first * 100);
        } 
        
             if (second > third && third > first && first < second){  // second > third > first
            System.out.println(second * 100 );
        }   else if (second > third && third < first && first < second) {// second > first > third
            System.out.println(second * 100 );
        }
        
             if (third > first && first > second && second < third){ // third > first > second
            System.out.println(third * 100);
        }   else if (third > first && first < second && second < third){ // third > second > first
            System.out.println(third * 100);
        }
     }
  }
}

// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  