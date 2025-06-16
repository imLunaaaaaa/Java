package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        int [][] arr = new int[2][3]; // 행2 열3

        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 0행 2열

        for (int row = 0; row < 2; row++) {
            System.out.print(arr[row][0] + " "); // 0열 출력
            System.out.print(arr[row][1] + " "); // 1열 출력
            System.out.print(arr[row][2] + " "); // 2열 출력
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
