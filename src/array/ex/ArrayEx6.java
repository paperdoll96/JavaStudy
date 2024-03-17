package array.ex;

import java.util.Scanner;

/*
    가장 작은수, 큰 수 찾기
    사용자로부터 n개의 정수를 입력받아 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력
 */
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        System.out.println("입력 받을 숫자의 개수를 입력하세요 : ");
        int[] numbers = new int[scanner.nextInt()];

        System.out.println(numbers.length + "개의 정수를 입력하세요");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        min = numbers[0];
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
           if ( numbers[i] < min) { // for문을 돌면서 numbers[i] 가 min보다 작으면 min에 넣는걸 계속 반복
               min = numbers[i];
           }
           if (numbers[i] > max) { // for문을 돌면서 numbers[i] 가 min보다 크면 min에 넣는걸 계속 반복
               max = numbers[i];
           }
        }

        System.out.println("최소값 = " + min);
        System.out.println("최대값 = " + max);


    }
}
