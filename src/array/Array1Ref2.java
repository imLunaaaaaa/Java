package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        // 배열의 인덱스는 0부터 시작하기 때문에 반복문에서 i = 0
        // 현재 배열의 크기가 5이기 때문에 students.length = 5
        // students.length 는 배열의 길이를 제공하는 기능이다. 조회만 가능, 대입은 불가능
        // for문의 조건이 i < students.length이기 때문에 isms 0, 1, 2, 3, 4까지만 반복한다.
        // i가 5가 되면 5 < 5가 되어 조건이 거짓이 되고, 반복을 종료한다
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }
    }
}
