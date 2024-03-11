package cond;

/* If문 */
// 특정 조건이 참인지 확인하고, 그 조건이 참(true)일 경우 특정 코드 블록을 실핸한다.
// 코드 블록 : {   }
public class If1 {
    public static void main(String[] args) {
        int age = 20; // 사용자 나이

        if (age >= 18) {
            System.out.println("성인입니다.");
        }

         /* if (age >= 18) 분석 */
        //age = 20
       // if (age >= 18) {"성인입니다"}
       // if (20 >= 18) {"성인입니다"} //age의 값은 20이다.
       // if (true) {"성인입니다"} //조건이 참으로 판명된다.
       // {"성인입니다"} //if문에 있는 코드 블록이 실행된다.


        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
        /* if(age < 18) 분석 */
        // if (age < 18) {"미성년자입니다"}
        // if (20 < 18) {"미성년자입니다"} //age의 값은 20이다.
        // if (false) {"미성년자입니다"} //조건이 거짓으로 판명된다.
        // 그러므로 해당 코드는 실행되지 않는다!

    }
}
