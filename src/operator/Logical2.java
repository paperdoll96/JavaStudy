package operator;

/* 논리 연산자의 활용
    변수 a가 10보다 크고 20보다 작은지 논리 연산자를 사요애서 확인해보자!
 */
public class Logical2 {
    public static void main(String[] args) {
        int a = 15;

        // a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20 ;  //(a > 10) && (a < 20)
                                            // 앞에서 한것처럼 한눈에 보이게 명확하게!
        System.out.println("result = " + result); // soutv 하면 자동완성 개꿀!

        /* 좀더 깔끔하고 읽기쉽게 작성하기 */
        boolean result2 = 10 < a && a < 20;
    }
}
