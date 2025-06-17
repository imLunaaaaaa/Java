package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        int [][] arr = new int[3][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }
        // 중첩된 for문을 사용해서 값을 순서대로 입력
        // arr[row][column] = i++; 후의 증감 연산자(++)를 이용해서 값을 먼저 대입하고 증가시킨다.
        // 코드에서 int=1로 1부터 시작한다.

        // 1차원 배열 초기화 {1, 2, 3}
        // 2차원 배열 초기화 {{1, 2, 3}, {4, 5, 6}}인데 명확하게  구분하기 위해 아래와 같이 작성
        // {1,2,3},
        // {4,5,6}

//        arr[0][0] = 1; // 0행 0열
//        arr[0][1] = 2; // 0행 1열
//        arr[0][2] = 3; // 0행 2열
//        arr[1][0] = 4; // 1행 0열
//        arr[1][1] = 5; // 1행 1열
//        arr[1][2] = 6; // 0행 2열

        for (int row = 0; row < arr.length; row++) {
                for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            // for문을 2번 중첩 사용함. 첫번째는 행을 탐색, 두번째는 열을 탐색함
            // 내부 for문은 밑에 주석처리한 코드와 같은 의미임
            // arr.length은 행의 길이를 뜻하며 2가 출력됨
            // arr[row].length는 열의 길이를 뜻하며 3이 출력됨

//            System.out.print(arr[row][0] + " "); // 0열 출력
//            System.out.print(arr[row][1] + " "); // 1열 출력
//            System.out.print(arr[row][2] + " "); // 2열 출력
            System.out.println(); // 한 행이 끝나면 라인 변경
        } // 아래 코드를 다 합한 게 이 코드임
        // for문으로 행(row)을 반복해서 접근
        // 각 행 안에 열(column)이 3개이다. 따라서 [row][0], [row][1], [row][2] 3번 출력한다.
        // row = 0인 for문에서 arr[0][0], arr[0][1], arr[0][2]로 1 2 3 출력
        // row = 1인 for문에서 arr[1][0], arr[1][1], arr[1][2]로 4 5 6 출력


        // 0행 출력
//        System.out.print(arr[0][0] + " "); // 0열 출력
//        System.out.print(arr[0][1] + " "); // 1열 출력
//        System.out.print(arr[0][2] + " "); // 2열 출력
//        System.out.println(); // 한 행이 끝나면 라인 변경

        // 1행 출력
//        System.out.print(arr[1][0] + " "); // 0열 출력
//        System.out.print(arr[1][1] + " "); // 1열 출력
//        System.out.print(arr[1][2] + " "); // 2열 출력
//        System.out.println(); // 한 행이 끝나면 라인 변경
    }
}
