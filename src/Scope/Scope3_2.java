package Scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
// Scope3_1과 다르게 temp를 if 안에 선언했다. 이제 temp는 if 코드 블록 안으로 스코프가 줄어든다.
// 덕분에 temp 메모리를 빨리 제거해서 메모리를 효율적으로 사용하고, temp 변수를 생각해야 하는 범위가 줄어서 더 유지보수하기 좋은 코드가 되었다.
// 예를 들어 for문 안에서만 사용되는 카운터 변수가 있다면 while문 보다는 for문을 사용해서 스코프 범위를 제한하는 것이 메모리 사용과 유지보수 관점에서 더 좋다.
// (while문은 변수의 스코프가 main{} 메서드 전체가 되고, for문은 변수의 스코프가 for문 안으로 한정되기 때문이다.)

// => 총 정리 : 변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다. 변수의 스코프를 꼭 필요한 곳으로 한정해서 사용하면 메모리를 효율적으로 사용하고 더 유지보수하기 좋은 코드를 만들 수 있다.
// 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.