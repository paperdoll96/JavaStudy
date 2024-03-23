package method;
/*
    메서드 사용
    자바에서는 함수를 메서드(Method)라 한다!
    메서드도 함수의 한 종류라고 생각하면 되나..?
    메서드는 크게 메서드 선언과 메서드 본문으로 나눌 수 있다!
 */
public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력:" + sum1);
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);
    }

    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;

       /* 메서드 선언 */
        // public static int add(int a, int b)
        // 메서드 선언 부븐으로 메서드 이름, 반환 타입, 매개변수(파라미터) 목록을 포함
        // int add(int a, int b) = int : 반환 타입 정의
        //                         add : 메서드 이름 부여
        //              (int a, int b) : 메서드를 호출할 때 전달하는 입력값을 정의, 메서드 선언에 사용되는 변수를 파라미터(매개변수)라 한다!

        /* 메서드 본문 */
        // 메서드 선언부 뒤에 있는 { } 를 수행해야하는 코드 블록
        // 메서드를 호출하면 메서드 본문이 순서대로 실행!
        // 메서드의 실행 결과를 반환하려면 return문을 사용해야 한다!


    }


}
