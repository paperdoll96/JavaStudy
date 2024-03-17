package array;
/*
    2차원 배열
    - 말그대로 하나의 차원이 추가된 배열을 말한다. 2차원배열은 행과 열로 구성
    - 행은 영어로 row, 열은 영어로 column이라한다. 자주 사용하는 단어라고 하니 잘 알아두자!

 */
public class ArrayDimension {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; //행(row), 열(column)

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //1행, 2열

        //0행 출력
        System.out.print(arr[0][0] + " "); //0열 출력
        System.out.print(arr[0][1] + " "); //1열 출력
        System.out.print(arr[0][2] + " "); //2열 출력
        System.out.println(); //한 행이 끝나면 라인을 변경한다.

        //1행 출력
        System.out.print(arr[1][0] + " "); //0열 출력
        System.out.print(arr[1][1] + " "); //1열 출력
        System.out.print(arr[1][2] + " "); //2열 출력
        System.out.println(); //한 행이 끝나면 라인을 변경한다.

        // 이 코드는 2차원 배열을 만들고, 배열의 값을 1부터 6까지 순서대로 직접 입력한다 ..
    }
}
