package loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println(); // 라인 구분하기 위해 엔터 넣어줌
        }
    }
}
// 중첩 반복문
// 외부 for 2번, 내부 for 3번 실행됨, 외부 1번당 내부 3번 실행되기 때문에 외부2*내부3 = 총 6번 내부 for 코드가 실행됨