package scanner;

import java.util.Scanner;

/*
    입력한 숫자의 합계와 평균
   -- 사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요.
     사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정합니다.
   -- 모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum 과 평균 average 를 출력하세요. 평균은 소수점 아래까지 계산해야 합니다.
 */
public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // 합계를 저장하기 위한 변수
        int count = 0; // 나누기 위한 입력 갯수 카운트
        int number = 0;

        System.out.print("숫자를 입력하세요. -1을 입력하면 계산 완료됩니다,");

        while (true) {
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
        }
        // 위 방법 말고 아래와 같은 방법도 가능하다!
//        while ((number = scanner.nextInt()) != -1){
//            sum += number;
//            count++;
//        }
        // 개인적으로 아래 코드가 더 깔끔하긴 하지만 난 코드를 더 읽기 쉬운
        // 위 방법이 더 나아보인다! 아직 초보자라서 그럴 수 있지만 전에 말한 것 처럼
        // 직관적으로 눈에 잘 읽혀야 좋은코드 같다!


        double average = (double)sum / count; // 소수점 이하 자리 출력을 위해 sum을 형변환
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평규 : " + average);
    }
}
