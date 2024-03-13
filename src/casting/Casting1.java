package casting;

/*
    형변환 - 자동 형변한
    만약 1L 물병과 500ml 물병이 있다고 가정하자.
    500ml 물을 1L 물병에 넣으면 당연히 남김 없이 들어 갈 수 있다!
    하지만 반대로 한다면 500ml가 채워지고 나머지 500ml는 넘쳐 흐를것이다.

    자바도 이와 마찬가지로 작은 범위에서는 큰 범위로 대입이 쉽게 가능하다.
    int < long < double
 */
public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); //longValue = 10

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue1 = " + doubleValue); //doubleValue1 = 10.0

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); //doubleValue2 = 20.0
    }

    // 이렇게 형이 변경되는것을 형변환이라 한다.
    // 이런 과정이 자동으로 일어나기 때문에 자동 형변환 또는 묵시적 형변환이라 한다!
}
