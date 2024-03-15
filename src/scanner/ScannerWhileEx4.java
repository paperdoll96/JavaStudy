package scanner;

import java.util.Scanner;

/*
   - 사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요.
     사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
   - 사용자에게 다음 세 가지 옵션을 제공해야 합니다: 1: 상품 입력, 2: 결제, 3: 프로그램 종료. 옵션은 정수로
     입력받으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
   - 상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
     결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0 으로 초기화하세요. (사용자가 총 비용을 확인하고,
   - 결제를 완료했다고 가정합니다. 따라서 다음 사용자를 위해 총 비용을 다시 0 으로 초기화 해야합니다.)
   - 프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하세요.
     위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하세요.
 */
public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0; // 상품의 총 합산 가격

         while (true) {
            System.out.print("1 : 상품입력, 2 : 결제, 3 : 프로그램종료");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("상품명을 입력하세요 : ");
                String product = scanner.next();

                System.out.print("상품 가격을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("상품 수량을 입력하세여 : ");
                int quantity = scanner.nextInt();

                totalPrice += price * quantity;
                System.out.println("상품명 : "+ product + "상품 가격 : " + price + "상품 수량 : " + quantity) ;
            } else if (option == 2) {
                System.out.println("총 비용 : " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            } else {
                System.out.println("잘못된 입력 입니다!");
            }

         }
        /*
            이번 문제는 좀 복잡했던거 같다.. 사실 좀 헤매기도 한거 같다
            문제의 의도를 정확하게 파악하는것도 중요한 일인거 같다!
         */
    }
}
