package method;

/*
    메소드 시작.
    함수(funtion) ?
    add(a, b) = a + b
        이름이 add 이고 a, b라는 두 값을 받는 함수. 이 함수는 a + b 연산을 수행
    함수를 한번 정의해두면 계속해서 재사용 할 수 있다!
 */
public class Method1 {
        public static void main(String[] args) {
            //계산1
            int a = 1;
            int b = 2;
            System.out.println(a + "+" + b + " 연산 수행");
            int sum1 = a + b;
            System.out.println("결과1 출력:" + sum1);

            //계산2
            int x = 10;
            int y = 20;
            System.out.println(x + "+" + y + " 연산 수행"); int sum2 = x + y;
            System.out.println("결과2 출력:" + sum2);
        }
        // 위 코드는 같은 연산을 두번 수행한다
    // Method1Ref 에서 함수를 사용하여 깔끔하게 해결해보자!

    }

