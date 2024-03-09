package variable;

public class VarType {
    public static void main(String[] args) {
        int a = 100; //정수를 다룬다. 예) 1 , 100 , 1000
        double b = 10.5; //실수를 다룬다. 예) 0.2 , 1.5 , 100.121
        boolean c = true; // 불리언 타입이라 한다. true , false 값만 사용할 수 있다. 주로 참과 거짓을 판단하는 곳에서 사용한다.
        char d = 'A'; // 문자 하나를 다룰 때 사용한다. 작은따옴표( ' )를 사용해서 감싸야 한다. 예) 'A' , '가'
        String e = "Hello Java"; //문자열을 다룬다. 큰따옴표를 사용해야 한다. 예) "hello java"

        // 참고로 String은 첫 글자가 다른 변수들과 달리 대문자로 시작한다.
        // 이 부분은 추후에 따로 배우는 내용이니 알고만 있자 !
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        /* 리터럴 */
        // 코드에서 개발자가 직접 적은 (위에서) 100, 10.5, true 와 같은 고정된 값을
        // 프로그래밍 용어로 리터럴 이라고한다. 변수의 값은 변할 수 있지만, 리터럴은 개발자가 직접
        // 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.
    }
}
