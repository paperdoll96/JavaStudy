package method;

/*
    메서드 정의
    public static(제어자) int(반환 타입) add(메서드 이름)(int a, int b(매개변수 목록)) {
        //메서드 본문, 실행코드
    }

    반환 타입 : 메서드가 실행된 후 반환하는 데이터의 타입을 지정, 값을 반환하지 않는 경우, 없다는 뜻의 void를 사용!

 */
public class Method2 {
    public static void main(String[] args) {
        printHeader(); // 매개변수가 없는 경우 호출 때도 비워두고 호출
        System.out.println("프로그램이 동작합니다.");
        printFooter(); }

    public static void printHeader() { // 매개변수가 없는 경우 이와 같이 비워두고 정의
                                       // 반환타입이 없는 경우 void로 정의
        System.out.println("= 프로그램을 시작합니다 =");
        return; // void의 경우 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
    /*
        void 와 return의 생략
        모든 메서드는 항상 return을 호출해야 한다! 그런데 반환타입이 void인 경우는 예외로 생략해도 된다!
        자바에서 반환타입이 없는 경우는 return을 마지막에 넣어준다!
        참고로 return 을 만나면 해당 메서드는 종료!
     */
}
