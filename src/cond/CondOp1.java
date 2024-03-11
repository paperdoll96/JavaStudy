package cond;

/* 삼항 연산자 */
// (조건) ? 참_표현식 : 거짓_표현식
// 삼항 연산자는 항이 3개라는 뜻. 위와 같이 항이 3개이다! 자바에서 유일하게 항이 3개인 연산자라서 삼항 연산자라 한다.
// 조건에 만족하면 참_표현식이 실행되고, 만족하지 않으면 거짓_표현식이 실행된다.
// if 문 처럼 코드 블럭을 넣을 수 있는 것이 아니라 단순한 표현식만 넣을 수 있다.
public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;

        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age = " + age + " status = " + status);
    }
}
