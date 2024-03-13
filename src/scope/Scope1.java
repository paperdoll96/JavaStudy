package scope;

/*
    변수는 선언한 위치에 따라 지여 변수, 멤버 변수(클래스, 인스턴스변수)와 같이 분류된다
    지역 변수는 이름 그대로 특정 지역에서만 사용 할 수 있는 변수이고, 여기서 말하는 지역이
    바로 변수가 선언된 코드 블록 {} 이다! 자신이 선언된 코드 블록 안에서만 생존하고
    자신이 선언된 코드를 벗어나면 제거되서 이후에는 접근 불가!
 */
public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m); //블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x = " + x);
        } //x 생존 종료

        //System.out.println("main x = " + x); //오류, 변수 x에 접근 불가
        System.out.println("main m = " + m);
    } //m 생존 종료

    /* ##만약 제거된 변수를 실행하면 cannot find symbol이라는 변수 이름을 찾을 수 없다는 컴파일 오류 발생! */

    /* 이렇게 변수의 접근 가능한 범위를 스코프(scope)라고 하고 번역하면 범위! */
}
