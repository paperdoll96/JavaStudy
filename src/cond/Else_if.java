package cond;

/* else-if */
// else if 문은 앞선 if문의 조건이 거짓일떄 다음 조건을 검사한다.
// 만약 앞선 if문이 참(true)라면 else if 를 실행하지 않음!

public class Else_if {
    public static void main(String[] args) {
        int age = 14;

        if(age <= 7) { //~7: 미취학
            System.out.println("미취학");
        } else if(age <= 13) { //8~13: 초등학생
            System.out.println("초등학생");
        } else if(age <= 16) { //14~16: 중학생
            System.out.println("중학생");
        } else if(age <= 19) { //17~19: 고등학생
            System.out.println("고등학생");
        } else { //20~: 성인
            System.out.println("성인");
        }
    }

    /* 참고 사항 */
    // if문에 else if 를 함께 사용하는 것은 서로 연관된 조건일 떼 사용한다
    // 그런데 서로 관련이 없는 독립 조건이면 else if를 사용하지 않고 if문을 각각 따로 사용해야 한다.
}
