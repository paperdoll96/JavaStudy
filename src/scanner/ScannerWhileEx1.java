package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = scanner.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름 : " + name + ", " + "나이: " + age);

        }
    }
    /*
        문제를 한번에 풀었다고 생각했는데 오류가 있었다.
        이름과 나이를 입력후에 엔터를 치면 결과는 잘나오는데 그다음 반복문이
        이름을 입력하세요가 건너띄어지는 문제가 있었다. 찾아보니 nextInt는 정수만 가져오기 때문에 \n 즉 엔터는 남아있던것.
        그래서 다음 이름을 입력 받는부분에서 \n이 그대로 넘어가서 빈 문자열을 입력해 버린것이다!
        이를 방지하기위해 scanner.nextLine();를 추가했다!
     */
}
