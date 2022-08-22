import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int random = sc.nextInt();

for (int i = 0; i < random; i++) {
    int first = sc.nextInt();
    int second = sc.nextInt();
    int result = plus(first,second);

    System.out.println("Case #" + (i+1) + ": " + first + " + " + second + " = " + result);

}
  sc.close();
    }
  

    public static int plus(int a, int b){
        int c = a + b;
        return c;
    }
}

// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 출력
// 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.