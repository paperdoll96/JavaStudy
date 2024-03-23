package array.ex;

import java.util.Scanner;
/*
    - 상품관리 프로그램
    상품등록 : 상품이름과 가격을 입력받아 배열에 저장
    상품목록 : 지금까지 등록한 모든 상품의 목록을 출력

    # 제약조건 : 상품등록은 최대 3개까지
 */
public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 3; // 제약 조건인 최대 상품 갯수
        String[] productName = new String[maxProducts]; // 최대 갯수가 3개이므로 배열을 maxProducts까지 확보
        int[] productPrices = new int[maxProducts]; // 위와 동일
        int productCount = 0; // 상품갯수

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) { // 문제에서는 if문을 사용했지만 나는 뭔가 사용자로부터 메뉴를 선택 받으니까
                            // switch문이 더 어울릴꺼 같아서 switch문을 사용했다
                case 1:
                    if (productCount >= maxProducts) {
                        System.out.println("상품등록 개수를 초과했습니다.");
                        break;
                    }
                    System.out.print("상품 이름을 입력하세요 : ");
                    productName[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
                    break;
                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다");
                    }
                    for(int i = 0; i < productCount; i++) {
                        System.out.println(productName[i] + " : " + productPrices[i]);
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 이 메소드 없이 break만 쓰게 된다면 switch문만 빠져나가고 무한루프로 설정해둔 while문은 빠져나가지 못한다!
                                            // 그래서 구글링해본 결과 이 메소드를 알게되었다.
                                            // System.exit(0) 을 사용하면 프로그램이 즉시 종료된다
                                            // '0' 은 프로그램이 정상종료되었음을 나타내는 상태코드이다!
                    break;

                default:
                    System.out.println("잘못된 메뉴입니다");

            }
        }
    }
}
