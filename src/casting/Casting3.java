package casting;

/* 오버플로우

 */
public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648
    }

    /*
        int의 최대값을 넘은 maxIntOver를 형변환한 값을 보면 딱 봐도 이상한
        -2147483648 이라는 결과가 출력되는데 참고로 이 숫자는 int형의 최소값이다!
        이처럼 오버플로우가 발생하면 시계가 한바퀴 도는 것처럼 다시 처음부터 시작한다!
     */

    // * 중요한건 오버플로우 발생하는것 자체가 문제! 최대한 오버플로우가 발생하지 않도록 하자!
    // 오버플로우가 발생했을떼 결과가 어떻게 나오는지 계산하는데에 신경쓰지말자!
    // 내가 개발자가 되어서 연차가 쌓였을때 그때 한번 파봐야지!
}
