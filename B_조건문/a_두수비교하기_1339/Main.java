package 조건문.a_두수비교하기_1339;

import java.util.Scanner;

public class Main {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    number (sc.nextInt(), sc.nextInt());

    sc.close();    
  }

  public static void number (int a, int b) {
    if(a > b) {
      System.out.println( ">");
    } else if (a < b) {
        System.out.println("<");
    } else {
        System.out.println("==");
    }
  }
}