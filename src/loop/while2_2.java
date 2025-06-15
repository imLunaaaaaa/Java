package loop;

public class while2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);

        // 변수 i를 사용해서 i값만 바꾸면 다른 코드는 바꾸지 않아도 된다.
    }
}
