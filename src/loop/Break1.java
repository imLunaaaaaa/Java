package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum = sum + i;  // sum = 1
            if (sum > 10) {  // 1 > 10 거짓
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
// while(true)는 조건이 항상 참이기 때문에 무한반복된다. break문으로 중간에 빠져나올 수 있다.
// 만약 sum > 10 조건을 만족하면 결과 출력 후 break 통해서 while문을 빠져나온다.
