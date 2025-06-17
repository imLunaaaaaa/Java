package Scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
// 조건이 맞으면 변수 m의 값을 2배 증가해서 출력하는 코드이다. 2배 증가한 값을 저장하기 위해 임시 변수 temp를 사용했다.
// 이 코드는 좋은 코드라고 할 수 없다. 임시 변수 temp는 if 조건이 만족할 때 임시로 잠깐 사용하는 변수이고, main{} 코드 블록 안에 선언되어 있다.
// 1. 비효율적인 메모리 사용 : temp는 if 조건 안에서만 사용하는 것이라 굳이 main 안에 선언할 필요가 없다.
// 2. 코드 복잡성 증가 : 좋은 코드는 군더더기 없는 단순한 코드이다. temp는 if 조건 안에서만 필요하고, 여기서만 사용하는 것이다.
// 만약 if 안에 temp를 선언했다면 if가 끝나면 temp를 생각하지 않아도 된다. 하지만 지금 코드는 if가 끝나도 main 어디서나 temp를 접근할 수 있다.
// 누군가 유지보수를 할 때 m과 temp를 다 신경써야 한다. 스코프가 불필요하게 넓은 것이다. 지금은 코드가 단순하지만 실무에서는 코드가 매우 복잡하다.
