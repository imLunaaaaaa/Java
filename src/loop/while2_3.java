package loop;

public class while2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
// while문을 사용하면 원하는 횟수만큼 같은 코드를 반복 실행할 수 있다.
// 반복 횟수 정하기 : i가 endNum이 될 때까지 반복 실행하면 된다. i가 endNum보다 크면 while문을 종료한다.
// i=1 endNum=3 이면 3번 반복 i=1, 2, 3
// i=3 endNum=4 이면 2번 반복 i=3, 4