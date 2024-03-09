package operator;

 /* 증감 연산자
 *  증가 및 감소 연산자를 줄여서 증감 연산자라고 한다!
 *  증감 연산자는 ++와 --로 표현되며 변수의 값을 1만큼 증가시키거나 감소시킨다.
 *  프로그래밍에서는 값을 1씩 증가하거나 1씩 감소할 때가 아주 많다고 한다.*/
public class OperatorAdd1 {
     public static void main(String[] args) {
         int a = 0;

         a = a + 1;
         System.out.println("a = " + a); //1
         a = a + 1;
         System.out.println("a = " + a); //2
         // 기본적으로 변수 a의 값을 하나 증가하려면 a = a + 1; 연산을 수행해야 한다.

         // 하지만 아래와 같이 증감연산자를 사용하면 코드를 획기적(?)으로 줄일 수 있다!
         //증감 연산자
         ++a; //a = a + 1
         System.out.println("a = " + a); //3
         ++a; //a = a + 1
         System.out.println("a = " + a); //4
         /* 값을 하나 감소할 때는 --a 와 같이 표현하면 된다. 이것은 a = a - 1 이 된다. */
     }
}
