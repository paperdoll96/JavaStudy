package array.ex;

import java.util.Scanner;

/*
   이전 문제에서 입력 받을 숫자의 개수를 입력받도록 개선
 */
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int[] numbers = new int[scanner.nextInt()];

//        System.out.println(numbers.length);
        // 이런 방식으로 되나? 의문점이 들어서 콘솔에 찍어보았다. 되는거같은데?!
        //
        // 하지만 구글에서 찾아보니 배열의 크기를 동적으로 지정 할 수는 있지만, -1 혹은 숫자가 아닌 문자의 입력에 제한이 없어서 NegativeArraySizeException, 문자는 InputMismatchException이 발생한다!
        /*
            하지만 내 풀이와 달리 답에서는 좀더 간략했다.
            먼저 입력받을 숫자 개수를 입력할떄
            int count = scanner.nextInt(); 로 선언하고
            그 다음 int[] numbers = new int[count]로 사용했따

         */
        System.out.println(numbers.length + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        average = (double)sum / (numbers.length);

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);
    }
}
