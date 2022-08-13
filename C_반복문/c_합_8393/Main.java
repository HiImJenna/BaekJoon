package C_반복문.c_합_8393;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int random = sc.nextInt();
      int sum = 0;
      
        
    

        for (int i = 0; i <= random; i++) 
            sum += i;
            System.out.println(sum);

    
    sc.close();
}
}

// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.