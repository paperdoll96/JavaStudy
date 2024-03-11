package loop;

/* continue 는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는 데 사용 */
/*
    while(조건식) {
        코드1;
        continue;//즉시 조건식으로 이동한다.
        코드2;
    }
 */
public class Continue {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
