package Casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // ing -> long
        System.out.println("long value: " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("double value: " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("double value2: " + doubleValue);
    }
}
// 작은 범위에서 큰 범위로는 당연히 갓을 넣을 수 있다. int -> long -> double
// 큰 범위에서 작은 범위로는 소수점 버림, 오버플로우 같은 문제가 발생한다.
// 자바는 기본적으로 같은 타입에 값을 대입할 수 있다. 작은 범위 타입 -> 큰 범위 타입에 대입할 때는 문제가 되지 않는다.
// 하지만 결국 대입하는 형(타입)을 맞춰야 한다. 개념적으로는 다음과 같이 동작한다.
// intValue = 10
// doubleValue = intValue
// doubleValue = (double) intValue  -> 형 맞추기
// doubleValue = (double) 10  -> 변수 값 읽기
// doubleValue = 10.0  -> 형 변환
// 이렇게 앞에 (double)와 같이 적어주면 int형이 double형으로 형이 변한다. 이렇게 형이 변환되는 것을 형변환이라고한다.
// 작은 범위 타입 -> 큰 범위 타입에 대입할 때 개발자가 직접 형변환을 하지 않아도 된다. 이런 과정이 자동으로 일어나기 때문에 자동 형변환 또는 묵시적 형변환이라고 한다.