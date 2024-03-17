package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;

        for (int i = 0; i < students.length; i++){
            total += students[i];
        }
        // 위 for는 향상된 으로 바꾸면 더 간결해진다.
        // 인텔리제이는 진절해서 향상된for문으로 바꾸겠냐고 물어보기도한다.. 개꿀..

        double average = 0.0;
        average = (double) total / 5;
        // 아직도 적응이 안되는게 변수를 초기화 하고 또 코드를 한줄 작성햇다..

        // double average = (double)total / 5;
        // 이렇게 한줄로 쓰도록 익숙해지자!


        System.out.println("점수 총합 : " + total);
        System.out.println(average);
    }
}
