package variable;
public class Var4 {
    public static void main(String[] args) {
        //1. 변수 선언, 초기화 각각 따로
        int a;
        a = 1;
        System.out.println(a); int b = 2; //2. 변수 선언과 초기화를 한번에
        System.out.println(b);
        int c = 3, d = 4; //3. 여러 변수 선언과 초기화를 한번에
        System.out.println(c);
        System.out.println(d);

        /*
            만약 변수를 초기화 하지 않고 사용하게 된다면?
            java: variable a might not have been initialized
            이라는 컴파일 에러가 발생한다!
            해석해보면 변수가 초기화 되지 않았다는 오류인데,
            컴퓨터에서 메모리는 여러 시스템이 함께 사용하는 공간이다.
            그래서 어떠한 값들이 계속 저장된다.변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용한다.
            그런데 그 공간에 기존에 어떤 값이 있었는지는 아무도 모른다.
            따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있다. 이런 문제를 예방하기 위해 자바는 변수를 초기화 하도록 강제한다.
         */
    }
}
