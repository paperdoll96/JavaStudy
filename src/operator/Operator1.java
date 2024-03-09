package operator;

/* 산술 연산자.
    산술연산자는 주로 숫자를 계산하는데 사용된다. 우리에게 익숙한 수학 연산을 수행한다!
    하지만 나는 처음에 %(나머지)가 조금 생소했다!*/
public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        /* 덧셈 */
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력: a + b = 7
        /* 뺄셈 */
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력: a - b = 3
        /* 곱셈 */
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력: a * b = 10
        /* 나눗셈 */
        int div = a / b;
        System.out.println("a / b = " + div); // 출력: a / b = 2
        // 5 / 2의 결과는 2.5가 되어야 하지만 결과는 소수점이 제거된 2가 나왔다.
        // 자바에서는 같은 int 형 끼리 계싼하면 계산 결과도 같은 int형을 사용한다고 한다! 그러면 int형은 정수이기 때문에 소숫점 이하를 포함 할 수 없지!


        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 출력: a % b = 1
        // 말 그대로 나머지 값. a를 b로 나눈후 남는 값을 의미 했다!
        // 나머지 연산자는 실무와 알고리즘?? 모두 종종 사용되니 기억하라 하셨다!

        /* 주의! 0으로 나누기
         10 / 0 과 같이 숫자는 0으로 나눌 수 없다! (수학에서 허용하지 않음)
        방금 예제에서 변수 b = 0 을 대입하면 5 / 0 이 된다. 이 경우 프로그램에 오류가 발생한다.
        실행하면 다음과 같은 예외를 확인할 수 있다.
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        예외가 발생하면 해당 시점 이후의 결과가 출력되지 않고 프로그램이 종료된다! */
    }
}
