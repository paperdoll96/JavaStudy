package scanner;

import java.util.Scanner;

/*
    이름 나이 입력받고 출력하기
 */
public class ScannerEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요 : ");
        int age = scanner.nextInt();


        System.out.println("당신의 이름은 [" + name + "] 이고, 나이는 [" + age + "]살 입니다.");
    }

    /*
        처음에 작성할때 변수를 선언하고 다음 출력을 했는데
        Exception in thread "main" java.util.InputMismatchException
        라는 오류가 발생했다. 항상 생각을 하고 어떻게 먼저 써야 되는지 고민을 잘 해보자!
     */
}
