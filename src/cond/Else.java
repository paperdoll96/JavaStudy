package cond;

/* else 문 */
// else 문은 if 문에서 만족하는 조건이 없을때 실행하는 코드를 제공한다.
// else 문을 사용하면 If1 에서 진행했던 코드를 더 간략하게 바꿀 수 있다.

public class Else {
    public static void main(String[] args) {
        int age = 20; // 사용자의 나이

        if (age >= 18) {
            System.out.println("성인입니다."); //참일 때 실행
        } else {
            System.out.println("미성년자입니다.");//만족하는 조건이 없을 때 실행
        }
    }
}
