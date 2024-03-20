package array.ex;

import java.util.Scanner;

/*
    2차원 배열
    사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의총점과 평균을 계산
 */
public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[4][3]; // 4명의 학생에 대한 3과목(국어, 수학, 영어) 점수를 저장할 2차원 배열을 선언
        String[] subject = {"국어", "수학", "영어"}; // 과목명을 저장할 배열

        // 각 학생에 대한 점수 입력 받기
        for (int i = 0; i < 4; i++) { // 학생 수만큼 반복
            System.out.println((i+1) + "번 학생의 성적을 입력해주세요"); // 배열은 0부터 시작하므로 사용자에게 보여줄 때는 i+1로 한다!
            for(int j = 0; j < 3; j++) { // 과목 수 만큼 반복
                System.out.print(subject[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt(); // 입력받은 점수를 배열에 저장
            }
        }

        // 각 학생의 총점과 평균 계산 및 출력
        for (int i = 0; i < 4; i++) { // 학생 수만큼 반복
            int total = 0; // 총점을 저장할 변수를 초기화
            for(int j = 0; j < 3; j++){ // 여기서 크나큰 실수를 하나 했다. j 가 아니라 i로 해서 무한루프에 빠지고 .ArrayIndexOutOfBoundsException 을 발생시킴.. 조심하자!
                total += scores[i][j]; // 각 과목 점수를 총점에 더하기
            }
            double average = total / 3.0;
            System.out.println(((i+1) + "번 점수 총합 : " + total + " 평균 : " + average));
        }
    }
}