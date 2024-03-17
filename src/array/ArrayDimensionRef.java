package array;

public class ArrayDimensionRef {
    public static void main(String[] args) {
        // 2x3 2차원 배열, 초기화
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}  // 이런식으로 라인을 적절하게 넘겨주면 행과 열이 명확!
        };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

        // arr.length는 행의 길이 : {{},{}} 를 생각해보면 arr 배열은 {} , {} 2개의 배열 요소를 가진다.
        // arr[row].length는 열의 길이 : arr[0] 은 {1,2,3} 배열을 뜻한다. 이 배열에는 3개의 요소가 있다.
    }
}
