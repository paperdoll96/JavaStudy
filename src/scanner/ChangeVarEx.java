package scanner;

/*
    변수 값 교환
    변수 a = 10 이 들어있거, b =20이 들어있다
    변수 a의 값과 변수 b의 값을 서로 바꾸어라
 */
public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp; // temp의 활용이 중요!

        temp = a; // temp라는 빈 박스의 변수에 10 저장
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
