package operator;

 /* 문자열 더하기 */
 // 자바는 특별하게 문자열에도 + 연산자를 사용할 수 있다! 문자열에 +연산자를 사용하면 두 문자를 연결할 수 있다!

public class Operator2 {
    public static void main(String[] args) {

        //문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);
        // "hello " 문자열과 "world" 문자열을 더해서 "hello world" 문자열을 만든다

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
       // s1 과 s2 변수에 있는 문자열을 읽는다.
       // "string1" + "string2" 연산을 수행해서 " string1string2 " 문자열을 만든다.
       // 결과를 result2 에 저장한다.
        System.out.println(result2);

        //문자열과 숫자 더하기1
        // 자바에서 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음 서로 더함!
        String result3 = "a + b = " + 10;
        // 그래서 위 식에서는 숫자 10이 int -> String으로 변경되어 "10"이 된다.

        System.out.println(result3);

        //문자열과 숫자 더하기2
        // 변수에 담겨 있어도 문자와 숫자를 더하면 문자가 된다.
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        /* 쉽게 이야기하면 문자열에 더하는것은 모두 문자열이 된다! 참고! */
    }
}
