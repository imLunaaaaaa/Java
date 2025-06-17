package Casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        int intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue); // 출력
    }
}
// int형은 double형보다 숫자의 표현 범위가 적고, 실수를 표현할 수 없다. 이 경우에 숫자가 손실되는 문제가 발생한다.
// 하지만 이러한 문제를 개발자가 감수하고도 값을 대입하고 싶다면 데이터 타입을 강제로 변경할 수 있다. (대략적인 결과를 보고 싶을 때 소수점을 버리고 정수만 보고 싶을 때)
// 형변환은 변경하고 싶은 데이터 타입을 (int)와 같이 괄호를 사용해서 명시적으로 입력하면 된다.
// intValue = (int) doubleValue;  ->  형변환 = 캐스팅 = 개발자가 직접 형변환 코드를 입력한다고 해서 명시적 형변환이라 한다.

// 명시적 형변환 과정
// // doubleValue = 1.5;
// intValue = (int) doubleValue;
// intValue = (int) 1.5;   ->   doubleValue에 있는 값을 읽는다.
// intValue = 1;      ->   (int)로 형변환 한다. intValue에 int형인 숫자 1을 대입한다.
// -> 형변환 후 출력해보면 숫자 1이 출력된다. 형변환을 한다고 해서 doubleValue 자체의 타입이 변경되거나 그 안의 값이 변경되는 건 아니다. doubleValue에서 읽은 값을 형변환 하는 것이다.
// doubleValue 안에 들어있는 값은 1.5 그대로 유지된다. 변수 값은 대입연산자(=)를 사용해서 직접 대입할 때만 변경된다.