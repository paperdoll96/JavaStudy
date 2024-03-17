package array.ex;

import java.util.Scanner;

/*
    합계와 평균
    사용자에게 5개의 정수를 입력받아서 합계와 평균을 계산하는 프로그램
 */
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int total = 0;

        System.out.println("5개의 점수를 입력하세요");
        for (int i = 0; i < scores.length; i++ ) {
            scores[i] = scanner.nextInt();
            total += scores[i];
        }
        double average = (double)total / 5;

        System.out.println("입력한 점수의 합계 : " + total);
        System.out.println("입력한 점수의 평균 : " + average);


    }
}
