package cond;

/* Switch 문 */
// switch문은 앞서 배운 if 문을 조금 더 편리하게 사용할 수 있는 기능이다.
// 참고로 if문은 비교 연산자를 사용 할 수 있지만, switch문은 단순히 값이 같은지만 비교 할 수 있음!

public class Switch1 {
//    switch (조건식) {
//        case value1:
//            // 조건식의 결과 값이 value1일 때 실행되는 코드
//            break;
//        case value2:
//            // 조건식의 결과 값이 value2일 때 실행되는 코드
//            break;
//        default:
//            // 조건식의 결과 값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드
//    }
//    - 조건식의 결과 값이 어떤 case 의 값과 일치하면 해당 case코드를 실행
//    - 위 에서 break 는 현재 실행중인 코드를 끝내고 switch문을 빠져나가게 하는 역할을 함
//    - 만약 break 문이 없으면, 일치하는 case 이후의 모든 case 코드들이 순서대로 실행된다.
//    - default 는 조건식의 결과값이 모든 case 의 값과 일치하지 않을 때 실행된다. if 문의 else 와 같다. default 구문은 선택이다.
//    - if , else-if , else 구조와 동일하다.
    public static void main(String[] args) {
    //grade 1:1000, 2:2000, 3:3000, 나머지: 500
    int grade = 2;
    int coupon;
         switch (grade) {
        case 1:
            coupon = 1000;
            break;
        case 2:
            coupon = 2000;
            break;
        case 3: coupon = 3000;
            break;
        default:
            coupon = 500;
         }
          System.out.println("발급받은 쿠폰 " + coupon);
    }
}
