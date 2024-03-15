package scanner;
/*
    구구단 출력
    사용자로부터 하나의 정수 n 을 입력받고, 입력받은 정수 n 의 구구단을 출력하는 프로그램을 작성하세요.
 */
import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단수를 입력해주세요! ");
        int n = scanner.nextInt();

        for (int i = 0; i <= 9; ++i){
            System.out.println(n + "X" + i + "=" + n*i );
        }

        // 저번에 for문 예제에서 구구단 출력한것처럼 for문을 썼다!
    }
}
