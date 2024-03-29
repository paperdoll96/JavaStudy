package variable;

public class VarType3 {
    /* 변수 타입 정리*/

    /*이렇게 많은 변수들을 실제로 다 외우고 사용해야 되나?
    선생님 말씀으로는 다음 타입들은 실무에서 거의 사용하지 않는다고 한다.

    byte : 표현 길이가 너무 작다. 또 자바는 기본으로 4byte( int )를 효율적으로 계산하도록 설계되어 있다. int 를 사용하자!!
           byte 타입을 직접 선언하고 여기에 숫자 값을 대입해서 계산하는 일은 거의 없다.
           대신에 파일을 바이트 단위로 다루기 때문에 파일 전송, 파일 복사 등에 주로 사용된다! 참고!

    short : 표현 길이가 너무 작다. 또 자바는 기본으로 4byte( int )를 효율적으로 계산하도록 설계되어 있다. int 를 사용하자!!

    float : 표현 길이와 정밀도가 낮다. 실수형은 double 을 사용하자.

    char : 문자 하나를 표현하는 일은 거의 없다. 문자 하나를 표현할 때도 문자열을 사용할 수 있다.
    예를 들어 String a = "b" 와 같이 사용하면 된다.

    참고: 메모리 용량은 매우 저렴하다. 따라서 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에 초첨을 맞추는 것이 더 효과적이다라고 말씀하셨다!.

    그렇다면 자주 사용하는 타입은?
    정수 - int , long : 자바는 정수에 기본으로 int 를 사용한다. 만약 20억이 넘을 것 같으면 long 을 쓰면 된다. 파일을 다룰 때는 byte 를 사용한다.
    실수 - double : 실수는 고민하지 말고 double 을 쓰면 된다.
    불린형 - boolean : true , false 참 거짓을 표현한다. 이후 조건문에서 자주 사용된다고 한다!
    문자열 - String : 문자를 다룰 때는 문자 하나든 문자열이든 모두 String 을 사용하는 것이 편리하다.
    */
}
