package casting;

/*
    명시적 형변환
    Casting1은 작은 범위에서 큰 범위로 가는 자동 형변환이다.
    반대로 큰 범위에서 작은 범위로 대입한다면?

 */
public class Casting2 {
    // double는 실수를 표현 할 수 있다. 따라서 1.5가 가능한데
    // int는 실수를 표현 할 수 없다. 이 경우 double -> int로 대입 하면 어떻게 될까?
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 주석을 풀면 컴파일 오류 발생
        // java: incompatible types: possible lossy conversion from double to int
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue); // 출력:1
    }

    // Casting1 위에서 말했듯이 1L에서 500ml 로 담으면 500ml의 손실이 발생한다.
    // 이런 문제는 매우 큰 버그를 유발 할 수 있음!
    // 하지만 위험을 감수하고 값을 강제로 대입 하고 싶다면 그때 쓰는게 바로 명시적 형변환!
    // 18번 줄과 같이 변수 앞에 (바꾸고싶은 형) 을 쓰면 된다!
}
