package Scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존시작
        if (true) {
            int x = 20; // x 생존시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        System.out.println("main m = " + m);
    } // m 생존 종료
}
// int m은 main{}의 코드블록 안에서 선언되었다. 따라서 선언 시점부터 main{}의 코드 블록이 종료될 때 까지 생존한다.
// if 블록 내부에서도 외부 블록에서 선언된 m에 접근할 수 있다. 쉽게 이야기하자면 생존 범위만 맞으면 다 접근할 수 있다.

// int x는 if{} 블록 안에서 선언되었다. 따라서 선언 시점부터 if{}의 코드 블록이 종료될 때 까지 생존한다.
// if{} 내부에서는 자신의 범위에서 선언한 x에 접근할 수 있다.
// if{} 코드 블록이 끝나면 x는 제거되어 접근할 수 없다.

// => 총 정리 : 지역 변수는 본인의 코드 블록 안에서만 생존한다. 자신의 코드 블록 안에서는 얼마든지 접근 가능하다.
// 하지만 자신의 코드 블록을 벗어나면 제거되기 때문에 접근할 수 없다.
// 이렇게 변수의 접근 가능한 범위를 스코프(Scope)라고 한다.
// int m의 스코프가 x보다 더 넓다.