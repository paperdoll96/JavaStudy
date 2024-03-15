package scanner;

import java.util.Scanner;
/*
    홀수 - 짝수
    사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수 인지 짝수인지 판별하는
    프로그램을 작성하시오!
 */
public class ScannerEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 ! : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력한 숫자 " + num + "은 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + num + "은 홀수입니다.");

        }

        String type = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println("입력한 숫자는 " + type + "입니다");
    }
    /*
        if문으로 직관적이게 작성 할 수 있지만 if 문항이 많지 않고 좀더 쉽게 볼수 있게
        아래처럼 삼항연산자를 적용해보았다!
     */
}
