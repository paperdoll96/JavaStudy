package array;
/*
    향상된 for문
    각각의 요소를 탐색한다는 의믜로 for-each문이라고도 불린다
    향상된 for문은 배열을 사용할 때 기존 for문 보다 더 편리하게 사용할 수 있다.

    for (변수 : 배열 또는 컬렉션) {
     배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
    }
 */
public class EngancedFor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for(int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }
        // 향상된 for문은 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 때문에 코드가 간결하고 가독성이 좋다.


        //for-each문을 사용할 수 없는 경우
        for(int i = 0; i < numbers.length; ++i) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
        // 향상된 for문에는 증가하는 인덱스 값이 감추어져 있다. 따라서 int i 와 같은 증가하는 인덱스 값을 직접 사용해야 하는 경우에는 향상된 for문을 사용할 수 없다.
    }
}
