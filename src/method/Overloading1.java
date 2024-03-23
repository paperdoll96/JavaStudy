package method;

/*
    메서드 오버로딩
    자바는 메서드의 이름 뿐만 아니라 매개변수 정보를 함께 사용해서 메서드를 구분한다!
    따라서 이름이 같고 매개변수가 다른 메서드를 정의할 수 있음!
    add(int a, int b)
    add(int a, int b, int c)
    add(double a, double b)
    이렇게 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 '메서드 오버로딩' 이라한다!

    오버로딩 규칙
    - 매개변수의 타입 및 순사가 다르면 오버로딩 가능! 참고로 반환 타입은 인정하지 않음!
 */
public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    // 두 번째 add 메서드: 세 정수를 받아서 합을 반환한다.
    // 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
