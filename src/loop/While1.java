package loop;

/* while문은 조건에 따라 코드를 반복해서 실행할 때 사용한다. */
/*
    while (조건식) {
        코드코드코드코드
    }
 */
// 조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while문을 벗어난다.
// 조건식이 참이면 코드 블럭을 실행한다. 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다(무한반복)

public class While1 {
    public static void main(String[] args) {

        int count = 0;

        while (count < 3) { // count가 3 이하 일때까지 반복
            count++; // count를 1씩 증가 1 -> 2 -> 3
            System.out.println("현재 숫자는:" + count);
        }
    }
}
