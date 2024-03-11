package loop;

/* break는 반복문을 즉시 종료하고 나간다. */
/*
    while(조건식) {
     코드1;
     break;//즉시 while문 종료로 이동한다.
     코드2;
    }
    while문 종료
 */
public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
