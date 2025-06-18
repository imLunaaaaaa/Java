package methdo;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;     // number는 int형 100
        printNumber(number);
    }

    public static void printNumber(double n) {  // double형 파라미터 변수 n에 100을 대입
        System.out.println("숫자: " + n);        // double n = 100    ->   double n = (double)100으로
                                                // double이 더 큰 범위이므로 자동 형변환 적용되고, 따라서 결과는 double n = 100.0
    }
}
// double형 매개변수(파라미터)에 int형 인수를 전달하는데는 문제가 없다.
// 메서드 호출 시 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다. 단 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있다.