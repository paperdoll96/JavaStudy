package array;

/*
    배열의 선언과 생성
 */
public class Array1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성
        // new int[5] 로 배열을 생성하면 배열의 크기만큼 메모리를 확보한다. (4byte * 5 = 20byte)

        //변수 값 대입
        students[0] = 90; students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
    // 이 변수는 참조값을 가지고 있다. 이 참조값을 통해 배열을 참조할 수 있다. 쉽게 이야기해서 참조값을
    // 통해 메모리에 있는 실제 배열에 접근하고 사용할 수 있다.

    // % new int[5] 라고 하면 총 5개의 int 형 변수가 만들어진다. 자바는 배열을 생성할 때 그 내부값을 자동으로 초기화한다.
    // 숫자는 0 , boolean 은 false , String 은 null (없다는 뜻이다.)로 초기화 된다.
}
