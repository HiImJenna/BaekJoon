package A_입출력과사칙연산.a_나누기_1008;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       double first = sc.nextDouble();
       double second = sc.nextDouble();

        result(first, second);

        sc.close();
    }

    public static double result (Double a, Double b) {
        double c = a / b;
        System.out.println(c);
        return c; 
    }
}