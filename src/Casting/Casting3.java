package Casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting= " + intValue);


        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting= " + intValue);
    }
}
// long maxIntOver = 2147483648L; 을 보명 int로 표현할 수 있는 가장 큰 숫자인 2147483647보다 1큰 숫자를 입력했다.
// 이 숫자는 int 범위를 넘어가기 때문에 마지막에 L을 붙여서 long형을 사용해야 한다.
// 결과를 보면 -2147483648 이라는 전혀 다른 숫자가 나온다. int형은 2147483648L를 표현할 수 있는 방법이 없다. 이렇게 기존 범위를 초과해서 표현하게 되면 전혀 다른 숫자가 나오고 이것을 오버플로우라 한다.
// 오버플로우가 발생하면 시계가 한 바퀴 돈 것 처럼 다시 처음부터 시작한다. 60분이 넘어 61분이 되면 1분이 되는 것처럼. -2147483648은 int의 가장 작은 숫자이다.
// 오버플로우가 발생하면 결과를 계산하느라 시간 낭비하지 말고, 고민하지 말고 변수 타입을 바꿔야 하다. int -> long으로 변경해서 사이즈를 늘리면 오버플로우 문제가 해결된다.