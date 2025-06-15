package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);


        // do-while문은 최초 한 번은 항상 실행된다. 따라서 "현재 숫자는:10"이 출력된다.
        // 코드블럭 실행 후 조건식을 검증한다. 10 < 3은 거짓이다. 따라서 do-while문을 빠져나온다.
        // do-while문은 최초 한 번은 코드 블럭을 꼭 실행해야 하는 경우에 사용하면 된다.
    }
}
