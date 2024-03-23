package method;

/*
    반환 타입
    반환 타입이 있는 메서드는 반드시 return을 사용해서 값을 반환해야한다!

 */
public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    /*
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
    }
        이 코드에서 if 조건이 만족할때는 true가 반환 되지만 만족하지 않으면 return문이 실행되지 않는다.
        따라서 이 코드를 실행하면 return문을 누락했다는 컴파일 오류가 발생
        java: missing return statement
        컴파일 오류는 착한 오류(?) 라고 한다!
     */
}
