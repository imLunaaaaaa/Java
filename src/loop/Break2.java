package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; ;) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + ", sum=" + sum);
                break;

            }
            i++;
        }
    }
}
// for (; ;)에 조건식이 없다. for문은 조건이 없으면 무한반복한다.
// sum > 10 조건을 만족하면 break를 이용해서 빠져나간다.
