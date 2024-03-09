package variable;
// 패키지를 맞추지 않으면 오류가 난다.
public class Var1 {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10);
        System.out.println(10);

        // 만약 위 세 문장 안에 있는 숫자를 바꾸려면 어떻게 해야 할까?
        // 하나씩 바꿀수도 있지만 그러기엔 너무 번거롭다/
        // 지금은 3개라서 일일이 바꿀 수 있지만 만약 100개가 넘어간다면?

        int a; // 변수 선언
        a = 20; // 변수 초기화

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        // 위와 같은 문제를 해결하기위해 위 처럼 변수를 선언해 보았다.
        // 모든 프로그래밍 언어는 이런 문제를 해결하기 위해 변수(variable)라는 기능을 제공한다.
        // 변수는 이름 그대로 변할수 있다는 뜻 이며, 데이터를 담을 수 있는 그릇 이라고 생각 할 수 있다.
    }
}
