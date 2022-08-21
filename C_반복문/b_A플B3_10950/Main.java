
package C_반복문.b_A플B3_10950;

    import java.util.Scanner;
    
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int random = sc.nextInt();
    
            for (int i = 0; i < random; i++) {
            int first = sc.nextInt();
            int second =  sc.nextInt();
    
            int result = plus(first, second);
            System.out.println(result);
            
            }
        
            sc.close();
    
            }
    
          public static int plus (int a, int b){
            int total = a + b;
            return total;
           }
    
          
    }
  