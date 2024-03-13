package casting;

/*
    형변환과 계산
    형변환은 대입뿐만 아니라, 계산을 할 때도 발생!
 */
public class Casting4 {
    // 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
    // 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 된다.
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); //1
        // 위는 int / int 이므로 int를 int형인 div1에 대입.
        // 따라서 1.5인 소수는 들어갈수 없으므로 1을 대입

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); //1.0
        // 여기도 마찬가지. int 나누기 int 를 하여 1이란 결과값을 얻지만 double에 대입해서 1.0 출력

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); //1.5
        // 여기서는 double형인 3.0과 int형인 2를 나눴다
        // 9번째줄 처럼 서로 다른 타입 계산은 큰 범위로 자동 형변환이 되기 때문에
        // double / int -> double / duoble 로 된다


        double div4 = (double) 3 / 2; // 명시적 형번환 사용! (double)int / int
        System.out.println("div4 = " + div4); //1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); //1.5
    }
}
