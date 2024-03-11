package cond;

/* Java14 새로운 switch문 */
// switch 문은 if 문 보다 조금 덜 복잡한 것 같지만, 그래도 코드가 기대보다 깔끔하게 나오지는 않는다.
// 이런 문제를 해결하고자 자바14부터는 새로운 switch 문이 정식 도입되었다.
public class Switch2 {
    public static void main(String[] args) {
        //grade 1:1000, 2:2000, 3:3000, 나머지: 500
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }

    // 기존과 차이점
    // 1. -> 를 사용한다
    // 2. 선택된 데이터를 반환할 수 있다.
}
