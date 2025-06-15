package loop;

public class while1_2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는:" + count);
        }
//       count의 값이 1, 2, 3으로 커지다가 count < 3이 거짓이 되면서 while문을 빠져나간다.
//       아래처럼 100으로 변경하면 while문의 코드블럭을 100번 반복한다.
//        while (count < 100) {
//            count = count + 1;
//            System.out.println("현재 숫자는:" + count);
//        }
    }
}
